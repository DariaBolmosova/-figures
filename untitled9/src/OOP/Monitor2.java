package OOP;

public class Monitor2 {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(10, "brown");
        Monitor monitor2 = new Monitor(14, "black");
        System.out.println(monitor1);
        System.out.println(monitor2);

        System.out.println(monitor1.getProducer());
        System.out.println(monitor2.getProducer());

        monitor1.setSize(24);
        monitor2.setSize(40);
        monitor1.setProducer("Samsung");

        System.out.println();
        System.out.println(monitor1);
        System.out.println(monitor2);
        System.out.println("monitor1=" + monitor1.getProducer());
        System.out.println("monitor2=" + monitor2.getProducer());

    }
}
