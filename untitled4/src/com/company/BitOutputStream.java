package com.company;
import java.io.*;
public class BitOutputStream extends FilterOutputStream{
    int bits;//быти
    int offset;//сдвиг, оффсет

    //конструктор класса
    public BitOutputStream(OutputStream out) {
        super(out);
    }

    //Записывает указанный бит в этот выходной поток.
    public void writeBit(int bit) throws IOException {
        if (bit==0) {
            bits<<=1;
        }
        else {
            bits=bits<<1|1;
        }
        offset++;
        if (offset==8) {
            write(bits);
            bits=0;
            offset=0;
        }
    }

    //очистка потока
    public void flush() throws IOException {
        if (offset!=0) {
            write(bits<<(8-offset));
            offset=0;
        }
        super.flush();
    }
    //закрытие потока
    public void close() throws IOException {
        flush();
        super.close();
    }
}