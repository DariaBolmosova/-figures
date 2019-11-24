package OOP;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(14, "black");
        Monitor monitor2 = new Monitor(14, "black");
        Monitor monitor3 = new Monitor(14, "black");

        Monitor monitor4 = new Monitor(20, "white");
        Monitor monitor5 = new Monitor(20, "white", 50, 50);
        Monitor monitor6 = new Monitor();
        monitor6.setSize(34);
        if (monitor1.gerSize() != monitor6.gerSize()) {
            System.out.println("ne ravni");
        }
        Monitor monitor10 = new Monitor();
        monitor10.setColor("pink");
        System.out.println("color  "+monitor10.getColor());
        monitor10.setSize(32);
        System.out.println("size  "+monitor10.gerSize());
        System.out.println(monitor5);
        System.out.println(monitor6);

    }
}


//инкапсуляция
//полиморфизм
//наследование
//три кита !


//сетеры и гетеры