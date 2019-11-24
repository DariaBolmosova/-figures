
package com.company;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Шифровать текст");
        System.out.println("2. Дешифровать в текст");
        System.out.printf("Ваш выбор: ");
        int choice = 0;//переменная выбора
        while (choice < 1 || choice > 2)//пока выбор не равен или 1 или 2
        {
            choice = in.nextInt();
            if (choice < 1 || choice > 2)
                System.out.printf("Ошибка ввода. Повторите ввод: ");
        }
        System.out.printf(choice == 1 ? "Введите путь к файлу с текстом: " : "Введите путь к файлу с шифром: ");
        String filename = in.nextLine();//путь к файлу
        filename = in.nextLine();//считываем путь к файлу из консоли
        File f = new File(filename);//созадём поток с именем файла
        System.out.printf(choice == 1 ? "Введите путь к сохраняемому файлу с зашифрованным текстом: " : "Введите путь к сохраняемому файлу с текстом: ");
        String filenameOUT = in.nextLine();//считываем путь к файлу из консоли

        switch (choice) {
            case 1://если выбрано шифрование
                Reader reader = new Reader(f);//экземпляр класса чтения файла
                String text = reader.texte();//прочитанный текст
                ArrayList<Lz78> list = new ArrayList<Lz78>();//массив экземпляров класса Lz78
                ArrayList<String> dicho = new ArrayList<String>();//словарь
                reader.compresser(text, list, dicho);

                //Вывод алфавита и словаря. ВЫВОДИТЬ ТОЛЬКО ПРИ ШИФРОВАНИИ ЧИТАБЕЛЬНОГО ТЕКСТА!
                System.out.println();
                System.out.println("Текст: " + text);
                System.out.println();
                System.out.println("Алфавит:");
                for (int i = 0; i < list.size(); i++)
                    System.out.println(list.get(i).getNumber() + " " + list.get(i).getChar());
                System.out.println();
                System.out.println("Словарь:");
                for (int k = 0; k < dicho.size(); k++)
                    System.out.println(dicho.get(k));
                System.out.println();
                //закончился вывод

                reader.writeInFileBit(list, filenameOUT);//запись в файл
                break;
            case 2://если выбрано дешифрование
                BitInputStream input = new BitInputStream(new FileInputStream(filename));//экземпляр класса чтения зашифрованного файлаа
                input.decompression(filenameOUT);//дешифрование и запись в файл
                break;
        }
    }
}

