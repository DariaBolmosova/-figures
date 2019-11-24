package oop2;

//метод который умеет только кошка. Полиморфизм

public class Cat extends Animal {
    public void catchMouse() {
        System.out.println("Cat is catching mouse");

    }

    @Override
    public void move() {
        System.out.println("Animal is walking");
    }
}
