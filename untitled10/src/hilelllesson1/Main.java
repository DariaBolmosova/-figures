package hilelllesson1;

public class Main {

   public static   int intValue=1;

    public static void increase(){

        if (intValue <10){
            intValue++;
            increase();
        }

}
    public static void main(String[] args) {
        increase();
        System.out.println("result = "+intValue);
        
    }
}
