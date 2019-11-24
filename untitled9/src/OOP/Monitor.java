package OOP;

public class Monitor {
    private static int LIMIT = 100;
    private static String producer = "GAMBERG";
    private int size; //0
    private String color;

    private int brightness = 50;
    private int contrast = 50;
    private boolean state;

    public Monitor() {

    }

    public Monitor(int s, String c) {
        size = s;
        color = c;
    }

    public Monitor(int s, String c, int br, int con) {
        size = s;
        color = c;
        brightness = br;
        contrast = con;

    }

    public void setSize(int s) {
        size = s;

    }
    public int gerSize(){
        return size;

    }

    public void power() {
        state = !state;

    }

    public void increaseContrast() {
        if (contrast < LIMIT) {
            contrast++;
        }
    }

    public void decresedContrast() {
        if (contrast < 0) {
            contrast--;
        }
    }

    public void increaseBrightness() {
        if (brightness < LIMIT) {
            brightness++;
        }
    }

    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getProducer() {
        return producer;
    }

    public static void setProducer(String producer) {
        Monitor.producer = producer;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getContrast() {
        return contrast;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        String result = ("Monitor : " + "{" + "size:" + size + ",color = "+color+"}");
        return result;
    }
}


// СЕТЕРЫ СЛУЖАТЬ ЧТОБЫ МЕНЯТЬ ЗНАЧЕНИЯ ПО УМОЛЧАНИЮ НА ДРУГИЕ