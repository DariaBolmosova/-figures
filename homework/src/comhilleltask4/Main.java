package comhilleltask4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        Scanner k = new Scanner(System.in);
        System.out.println("Введите число в гривнах: ");
        double number1 = k.nextDouble();
        System.out.println("Введите курс (Текущий курс обмена  0,036) : ");
        double number2 = k.nextDouble();
        System.out.println("Число в доларах : " + Calc.convertor(number1, number2));

        //2
        System.out.println("Введите простое число");
        int num = k.nextInt();
        int c1 = num % 10; //последнее число
        int b1 = ((num / 10) % 10);
        int a1 = ((num / 100) % 10);
        int sum = b1 + c1 + a1;
        System.out.println("Сумма цифр трехзначного числа : " + sum);

        //3
        System.out.println("Введите длину забора : ");
        double l = k.nextDouble();
        System.out.println("Введите ширину забора : ");
        double w = k.nextDouble();
        System.out.println("Периметр забора: " + Calc.farmer(l, w));
        System.out.println("Площадь газона: " + Calc.farmer2(l, w));

        //4
        System.out.println("Введите скорость первого поезда: ");
        double v=k.nextDouble();
        System.out.println("Введите скорость второго поезда: ");
        double v1=k.nextDouble();
        Calc.train(v,v1);
        //5
        System.out.println("Введите значение a: ");
        double a=k.nextDouble();
        System.out.println("Введите значение b: ");
        double b=k.nextDouble();
        System.out.println("Введите значение c: ");
        double c=k.nextDouble();
        Calc.kvadrat(a,b,c);

    }

}
