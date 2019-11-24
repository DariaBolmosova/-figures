package OOPLesson14;

public class ClassB extends ClassA {
private int z=10;

    public ClassB(int x, int y) {
        super(x, y);
    }

    public ClassB() {
    }

    public static void main(String[] args) {
        ClassB classB=new ClassB(1,10);
        System.out.println("x = "+classB.getX());
        System.out.println("y = "+classB.getY());


        ClassB classB2=new ClassB();
        System.out.println(classB2.getY());
        System.out.println(classB2.getX());
    }
}
