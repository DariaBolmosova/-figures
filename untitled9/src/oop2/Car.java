package oop2;

public class Car {
    private int speed;
    private int gaz;
    private boolean state;
    private Driver driver;

    public void start() {
        state = true;
        speed=0;
    }

    public void accelerate() {
        speed += 10;
    }

    public void slowdown() {
        speed -= 10;
    }

    public void pause() {
        speed = 0;

    }

    public void turnLeft() {
        System.out.println("Turn Left");
    }

    public void turnRight() {
        System.out.println("tURN RIGHT");

    }

}
