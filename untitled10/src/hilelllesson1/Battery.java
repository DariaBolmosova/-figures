package hilelllesson1;

public class Battery {

    private final String name;
    private int capacity;
    private final Demension demension;

    public Battery(final int width,final int height, final String name, int capacity) {
        demension=new Demension(width,height);
        this.name = name;
        this.capacity = capacity;
    }

    public int getWidth() {
        return demension.getWidth();
    }

    public int getHeight() {
        return demension.getHeight();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }


    public  int getCharge (int value){
        if (value <0) return 0;
        if (value >capacity) return 0;
        capacity=capacity-value;
        return value;
    }
}
