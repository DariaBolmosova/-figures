package hilelllesson1;

public class TestBattery {
    public  static void main (String []args) {
        Battery battery = new Battery(5, 5, "Varta", 1000);
        System.out.println("get me cgarge = " + battery.getCharge(10));
    }
}
