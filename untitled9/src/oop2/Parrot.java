package oop2;

public class Parrot extends Animal {
  enum ParrotColor{
      red,green,pink,blue,white,yellow
  }
  private ParrotColor color;

    public Parrot(ParrotColor color) {
        this.color=color;
    }

    @Override
    public void move() {
        System.out.println("Parrot is flying");
    }

}
