package OOPLesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoJSF {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();   // выделили память на денамический массив . ссылка на память называется element
        number.add(487);
        number.add(43);
        number.add(23);
        System.out.println(number.get(1));
        Object[] a = number.toArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");


        list2.add("X");
        list2.add("Y");
        list2.add("Z");


        list1.addAll(list2);
        System.out.println(list1.toString());
        System.out.println(list1.contains("d"));
        System.out.println(list1.indexOf(2));

        ArrayList<String> subTraction=new ArrayList<>();
        subTraction.add("C");
        subTraction.add("X");
        list1.removeAll(subTraction);
        System.out.println(list1.toString());
    }
}
