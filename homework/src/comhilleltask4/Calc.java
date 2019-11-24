package comhilleltask4;

public class Calc {
    public static double convertor(double number1, double number2) {
        return number1 * number2;
    }

    public static double farmer(double l, double w) {
        return (2 * (l + w));
    }

    public static double farmer2(double l, double w) {
        return l * w;
    }

    public static void train(double v, double v1) {
        double a = 4 / v;
        double b = 6 / v1;
        if (a < b) {
            System.out.println("Поезда не столкнутся");
        } else {
            System.out.println("Внимание ! Поезда столкнутся ");
        }
    }
    public static void kvadrat(double a,double b,double c){
        double x1,x2,d;
        d=Math.pow(b,2)-(4*a*c);
        if(d>0){
            x1=((-1)*b+Math.sqrt(d))/2*a;
            x2=((-1)*b-Math.sqrt(d))/2*a;
            System.out.println("x1 =  "+x1+"x2 = "+x2);
        }
        else if(d==0) {
            double x3=-b/(2*a);
            System.out.println("x1,x2= "+x3);
        }else{
            System.out.println("Уравнение не имеет корней");
        }
        }

    }


