package hilelllesson20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException
    {
        InputStream is = new FileInputStream("1.txt");
        int data = 0;
        while ((data = is.read())!=-1) {
            System.out.println((char)data  );
        }
    }

    {

    }
} .0