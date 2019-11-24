import java.io.*;
import java.util.*;
public class BitInputStream extends FilterInputStream {

        int bits;//бит
        int mask;//маска

        //конструктор класса
        public BitInputStream(InputStream in) {

            super(in);//вызов родительского конструкутора
        }

        /**
         * Читает следующий бит из этого входного потока. Значение возвращается как
         * int в диапазоне от 0 до 1.
         * достигнут поток, возвращается значение -1. Этот метод блокируется.
         * Поток данных обнаружен.
         * исключение выбрасывается.
         */

        //чтение бита
        public int readBit() throws IOException {

            int bits;
            int mask = this.mask;

            if (mask == 0) {
                bits = read();
                if (bits == -1)
                    return -1;

                this.bits = bits;
                mask = 0x80;
            } else {
                bits = this.bits;
            }

            if ((bits & mask) == 0) {
                this.mask = mask >> 1;
                return 0;
            } else {
                this.mask = mask >> 1;
                return 1;
            }
        }//чтени

        //чтение 16-битного символа
        public int[] readBit16(int nombre ) throws IOException{

            int[] bits = new int[nombre];
            for(int i=0; i<bits.length;i++)
                bits[i] = -1;

            int j = 0;
            int tmp=-1;
            for(int i = 0;i < bits.length; i++){
                tmp = readBit();
                if(tmp < 0){
                    break;
                }
                else{
                    bits[j] = tmp;
                    j++;
                }
            }
            return bits;
        }

        //генерирование связанного списка битов
        public LinkedList<Integer> bits(int [] bits){
            LinkedList<Integer> tmp = new LinkedList<Integer>();
            for(int i=0; i< bits.length;i++){
                if(bits[i] == 1){
                    tmp.add(bits[i]);
                    for(i=i+1; i<bits.length; i++){
                        tmp.add(bits[i]);
                    }
                }
            }
            return tmp;
        }

        //Конвертация списка битов в десятичное число
        public int convertInDecimal(LinkedList<Integer> binaires){
            int n = binaires.size();
            int p = n -1;
            int res = 0;
            for(int val : binaires){
                res =  (int)(res+ val*Math.pow(2, p));
                p--;
            }
            return res;
        }

        //Перевод int в char
        public static char intToChar(int n){
            return (char) n;
        }

        //дешифрация
        public void decompression(String filename) throws IOException {
            StringBuffer t = new StringBuffer("");
            int reference = bits(readBit16(32)).size();
            int j; // pointeur
            char lettre; // char
            int cpt = 0;
            ArrayList<Lz78> list = new ArrayList<Lz78>();
            ArrayList<Lz78> dicho = new ArrayList<Lz78>();
            String s = "";
            boolean b = false;
            while(this.available() != 0){
                j = convertInDecimal(bits(readBit16(reference)));
                lettre = intToChar(convertInDecimal(bits(readBit16(8))));
                list.add(new Lz78(j,lettre));
                if(lettre == '\u0000')
                    b = true;
                cpt++;
                if(j == 0){
                    t.append(lettre);
                    s = ""+lettre;
                    StringBuffer tmp  = new StringBuffer(s);
                    dicho.add(new Lz78(cpt,tmp));

                } else {
                    StringBuffer res = dicho.get(j-1).getSb();
                    String str = res.substring(0,res.length());
                    str += lettre;
                    res = new StringBuffer(str);
                    dicho.add(new Lz78(cpt,res));

                    t.append(res);
                }
            }

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            String end = "";
            if(b == false)
                end = t.substring(0,t.length());
            else
                end = t.substring(0,t.length()-1);
            out.write(end);
            out.close();
        }

    }

