package classworkhillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //compare(3, 3);
        handleSelection2(3);
        System.out.println("Введите номер месяца ");
        int month =inputKey();
        System.out.println("Вы ввели номер месяца: "+month);
    }

   // public static void compare(int num1, int num2) {
       // if ((num1 > num2)) {
           // System.out.println("num1>num2");

      //  } else {
         //   if (num1 == num2) {
           //     System.out.println("num1 equalse num2");

            //} else {
              //  System.out.println("num1 less num2");
            //}
       // }
    public static int inputKey(){
        Scanner scanner=new Scanner(System.in);
        int Input= scanner.nextInt();
        return  Input;

    }

        public static void handlSelection(int n){
            if (n==1){
                System.out.println("go to transfer");
            }else if (n==2){
                System.out.println("go to dep");
            }
            else if (n==3){
                System.out.println("go to keubord");
            }
            else if(n==4){
                System.out.println("go to mousw ");
            }
            else {
                System.out.println("go to forest");
            }
        }

        public static void  handleSelection2(int n){
        switch (n) {
            case 1:
            System.out.println("go to transfer");
            break;
            case 2:
            System.out.println("go to dep");
            break;
            case 3:
            System.out.println("go to keubord");
            break;
            case 4:
            System.out.println("go to mousw ");
            break;
            default:
                System.out.println("go to forest");
        }

        }
        }

