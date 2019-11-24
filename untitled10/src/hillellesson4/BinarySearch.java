package hillellesson4;

import java.util.Scanner;

public class BinarySearch {
    public static void search(Scanner scanner,int value,int start,int end) {
        System.out.println("число больше "+value+"?");
        switch ( (scanner.nextInt())){
            case 0: {
                System.out.println("Finish - " + value);
                break;
            }
            case 1:{
                search(scanner, (value+end)/2,value,end);
                break;
            }
            case 2:{
                search(scanner,(start+value)/2,start,value);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        search(scanner,50,0,100);
    }
}
