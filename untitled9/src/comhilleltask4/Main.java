package comhilleltask4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // twoCycle();
        // mathRandom();
        // int x = new Random().nextInt(10);
        // System.out.println("fdf  " + x);
        // demoArr();

        arr2();

    }

    public static void arr2() {
        System.out.println("введите диапазон");
        int len =helper.getInputKeyboard();
        int[] a = new int[len];
        for (int i = 0; i < 50; i++) {
            a[i] = getRandom(0,5);
        }
        for (int e : a) {
            System.out.println(e + ";");

        }


    }

    public static int getRandom(int min, int max) {
        int r = (int) ((max - min) * Math.random()) + min;
        return r;
    }


   // public static void arr() {
       // int[] a = new int[]{1, 2, 3, 4, 5};
        //int sum = 0;
        //for (int i = 0; i < a.length; i++) {
        //    sum += a[i];  // sum=sum+a[i];
        //}
        //System.out.println(sum);
   // }//



    public static void mathRandom(int l) {
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * l;
            int b = (int) a;
            System.out.println(b);
        }
        for (int j = 0; j < 5; j++) {
            int rnd = (int) ((Math.random() * 6) - 5);
            System.out.println(rnd);

        }

    }

    //double abso=Math.abs(15);
    ///  System.out.println(Math.sqrt(256));
    //  System.out.println( Math.random());
    //System.out.println(Math.floor(2.3));
    // System.out.println(Math.max(12,13));
    //System.out.println(Math.pow(2,3));
    //System.out.println(abso);
    //System.out.println(Math.min(12,3));


    // public static void twoCycle() {
    //  double sum=0.0;
    // for (int i = 1; i <=4; i++) {
    //    for (int j = 1; j <=4; j++) {
    //       sum=sum+j;
    //      System.out.printf("i = %d\tj = %d\tf = %f\t\n",i,j,sum); // %f- для чисел с плавующей точкей.%s-для строковіх значений ;
    //  }

    // }
    //}
}


//  System.out.println(number(100));

// public static int number (int n){
// int sum=0;
// for (int i=1;i<=n;i++){
//     sum=sum+i;
// }
//  return sum;
//}


// for(int i=0;i<=3 ;i++){ // i++ = i=i+1 (нахождение текущего значение увеличение его на единицу перезаписівапние)
//  System.out.println(i);
// }

// while(true) - бесконечній цикл