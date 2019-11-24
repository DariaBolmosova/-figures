package com.company;

public class Calculator {

    public static int add(int x, int y) {    //в скобках мы указываем аргументы
        int result = x + y;
        return result;

    }

    public static float add(float x, float y) {
        float result =x+y;
        return result;
    }

    public static double add(double x, double y) {
        return x + y;
    }


    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;                      // или return x/y
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;

    }


}