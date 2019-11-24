package oop2;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();



        Warm warm1 = new Warm();
        Warm warm2 = new Warm();
        Warm warm3 = new Warm();

        Animal[] animals = new Animal[]{
                cat1, cat2, cat3, cat4,
                warm1, warm2, warm3
        };
        for (Animal currentAnimal:animals) {
            currentAnimal.move();

        }
    }
}

// animals[0] = cat1;
// animals[1] = cat2;
// animals[2] = cat3;
//animals[3] = cat4;


//Cat myCat = new Cat();// экзмпляр класса обьекта
// myCat.move();
//myCat.eat();
//myCat.sleep();
// myCat.move();