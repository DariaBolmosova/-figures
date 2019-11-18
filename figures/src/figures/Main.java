package figures;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set figures =new TreeSet<Rectangle>();
        figures.add(new Rectangle(10,7));
        figures.add(new Rectangle(2,3));
        figures.add(new Rectangle(6,2));
        figures.add(new Rectangle(9,11));
        figures.add(new Rhombus(2,1,3));
        figures.add(new Square(2,2));
        figures.add(new Square(6,2));
        figures.add(new Square(4,2));


        for (Object element:figures) {
            System.out.println(element);
        }

    }


}


