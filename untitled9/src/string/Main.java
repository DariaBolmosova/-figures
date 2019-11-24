package string;

public class Main {
   private static final double RATIO=3.4;
   private static int d=2;
    public static void main(String[] args) {
        double newVal=RATIO+1;
        anotherMethod();
    }
    public static void anotherMethod(){
        double newVal=RATIO+2;
        d=d>>2;
        System.out.println(d);// d/4; d>>2
    }

}
