package OOPLesson14;

public class Demo {
    public static void main(String[] args) {
        String s1=new String("ABC");
        String s2="ABC";
        String s3;
        System.out.println(s1.length());
        System.out.println(addPrefix(s1).length());
    }

    public static String addPrefix(String temp){
        String prefix="system_";
        return prefix+temp;
    }


}
