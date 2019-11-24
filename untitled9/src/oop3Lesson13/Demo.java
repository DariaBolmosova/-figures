package oop3Lesson13;

public class Demo {
    public static void main(String[] args) {
        int x=10;
        int y=5;
       /// int z=x++ + y++; // увеличение происходит после операции ПОСЛЕ
        int k=++x + ++y;  // увеличение просїодит ДО операции сложения
        System.out.println(k);

        System.out.println(x);
        System.out.println(y);
       // System.out.println(z);
    }
}
