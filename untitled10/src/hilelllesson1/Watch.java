package hilelllesson1;

public class Watch {
    private final String name;
    private final Demension demension;
    private int hour=0;
    private int minute=0;
    private int second=0;

    public Watch(String name, Demension demension) {
        this.name = name;
        this.demension = demension;
    }

    public String getName() {
        return name;
    }

    public Demension getDemension() {
        return demension;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void run() {
        second++;
        if (second==59){
            second=0;
            if (minute==59){
                minute=0;
                hour++;
            }
        }
    }
}
