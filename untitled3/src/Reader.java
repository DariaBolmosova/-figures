
import java.io.*;
import java.util.*;

public class Reader {

    private File f;

    //конструктор класса
    public Reader(File f) {
        this.f = f;
    }

    //чтение текста из файла
    public String texte() throws IOException {
        Scanner in = new Scanner(this.f);
        StringBuffer s = new StringBuffer("");
        while (in.hasNextLine()) {
            s.append(in.nextLine());
            s.append("\n");
        }
        if (s.equals("")) return "";
        String newS = s.substring(0, s.length() - 1);
        return newS;
    }

    //шифрование
    public void compresser(String phrase, ArrayList<Lz78> list, ArrayList<String> dicho) {
        int cpt = 0;
        int number = 0;
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < phrase.length(); i++) {
            s.append(phrase.charAt(i));
            String str = s.substring(0, s.length());
            number = dicho.indexOf(str) + 1;
            if (number == 0) {
                cpt++;
                dicho.add(str);
                if (s.length() == 1) {
                    list.add(new Lz78(0, s.charAt(0)));
                } else {
                    String tmp = s.substring(0, s.length() - 1);
                    number = dicho.indexOf(tmp) + 1;
                    list.add(new Lz78(number, phrase.charAt(i)));
                }
                s = new StringBuffer("");
            } else if (number != 0 && i == phrase.length() - 1) {
                cpt++;
                list.add(new Lz78(number, '\u0000'));
                dicho.add(str);
            }
        }
    }

    // преобразование целого числа от 0 до 9 в символ '0', '1', .., '9'
    public char intToChar(int a) {
        String s = "" + a;
        return s.charAt(0);
    }

    // преобразование int в строку, содержащую его двоичное представление
    // например, 7 становится "111"
    public StringBuffer intToByte(int a) {
        if (a == 0)
            return new StringBuffer("0");
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (a != 0) {
            int x = a % 2;
            list.add(x);
            a /= 2;
        }
        StringBuffer b = new StringBuffer("");
        for (int i = list.size() - 1; i >= 0; i--) {
            char tmp = intToChar(list.get(i));
            b.append(tmp);
        }
        return b;
    }


    //запишите запись в файл, чтобы представить максимальный размер в виде указателя
    public void writeMaxInFile(BitOutputStream x, StringBuffer res) throws IOException {
        int z = 0;
        while (z < 32 - res.length()) {
            x.writeBit(0);
            z++;
        }
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '1') {
                x.writeBit(1);
            } else {
                x.writeBit(0);
            }
        }
    }


    // возвращает максимальный указатель списка
    // вернёт фиксированный размер
    public int max_list(ArrayList<Lz78> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max <= list.get(i).getNumber())
                max = list.get(i).getNumber();
        }
        return max;
    }

    // пишем указатель в файл
    public void writeNumberInFile(BitOutputStream x, StringBuffer res, StringBuffer pt) throws IOException {
        //мы пишем указатель, поскольку он имеет фиксированный размер
        int w = res.length() - pt.length();
        while (w != 0) {
            x.writeBit(0);
            w--;
        }
        //написать остальную часть указателя
        for (int i = 0; i < pt.length(); i++) {
            if (pt.charAt(i) == '1') {
                x.writeBit(1);
            } else {
                x.writeBit(0);
            }
        }
    }

    // пишет символ в файл
    public void writeCharInFile(BitOutputStream x, char c) throws IOException {
        int a = (int) (c);
        int z = 0;
        StringBuffer res = intToByte(a);
        while (z < 8 - res.length()) {
            x.writeBit(0);
            z++;
        }
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '1') {
                x.writeBit(1);
            } else {
                x.writeBit(0);
            }
        }
    }

    //пишет все быти в файл
    public void writeInFileBit(ArrayList<Lz78> list, String filename) throws IOException {

        BitOutputStream x = new BitOutputStream(new FileOutputStream(filename));
        int max = max_list(list);
        StringBuffer res = new StringBuffer("");

        if (max == 0)
            res = new StringBuffer("1");
        else
            res = intToByte(max);

        writeMaxInFile(x, res);
        for (int i = 0; i < list.size(); i++) {

            StringBuffer number = intToByte(list.get(i).getNumber());

            writeNumberInFile(x, res, number);

            writeCharInFile(x, list.get(i).getChar());
        }
        x.close();
    }
}