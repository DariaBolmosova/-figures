package hometask1;

public class Main {

    public static void main(String[] args) {
        int x = 4;
        int r= x&1; // операция логического умножения. AND
        int y=8;
        int r1= y|1; // операция OR
        int z=~1;
        System.out.println(z);
        byte n1=0b00000001;
        byte n2=0b00000010;
        byte n3=0b00000100;
        System.out.println(n1+";"+n2+";"+n3);
        castData();
        compare2Numbers(2,4);
        compare2Numbers(7,4);

        if(isNumberEven(10)==true) { //или без ==true
            System.out.println("число является четнім");
        } else {
            System.out.println("число является нечетнім");
        }
    }
    public static void castData(){
        byte b =5;
        int x = b;
        System.out.println(x);
    }


    public  static  void compare2Numbers(int x,int y){
        boolean result =x<=y;  // && (в программирование И) boolean result = x<=y && (x>18)
        if (result==true){
            System.out.println("x<=y");
        } else {
            System.out.println("x>=y");
        }

    }

    public static boolean  isNumberEven(int num){
        int result= num&1;
        if (result==0) {  // операция сравнения
            return true;
        } else {
            return false;
        }


    }
}
