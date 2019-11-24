package hilellleson5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestCollection {

    private static boolean isTrue (Collection<Integer> list, Integer test) {
        for (Integer value : list) {
            if (value.intValue()==test)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(0,10);
         //list.add(1);
      // list.add(2);
        //list.add(10);
        //list.add(40);
        //list.add(120);
        //list.add(150); //  не работает потому что вышли за диапазон интегера (127)

        System.out.println(isTrue(list,10));
    }
}
