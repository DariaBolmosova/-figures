package com.company;

public class Start {
    public static void main(String[] args) {
       int addResult=Calculator.add(4,4);
        System.out.println(addResult);

         System.out.println(Calculator.mult(3,4));;
         testCalculator();
    }

    public static void testCalculator() {       // или же сделать отдельній метод и прописать testCalculator();
        int actual= Calculator.mult(2,2);
        System.out.println("Check that 2*2=4, our result is "+actual);

    }
}
