package oop3Lesson13;

public class Data {
    enum Seasons{
        winter,spring,summer,autumn
    }
    enum Days{
        monday,tuesday,wednasday,thursday,friday,saturday,sunday
    }

    public static void main(String[] args) {
        Days myLoveDays=Days.friday;
        System.out.println(myLoveDays);
        System.out.println(getSeason(Seasons.autumn));
    }

    public static int getSeason(Seasons season){
        switch (season) {
            case autumn:
                return 4;
            case spring:
                return 2;
            case summer:
                return 3;
            case winter:
                return 1;
        }
        return -1;
        }

}
