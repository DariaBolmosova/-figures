package OOPLesson18;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int idCard;
    private CreditHistory creditHistory;

    public int getAge() {
        return age;
    }

    public Person(int idCard, String name, int age) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object o) {
        Person p = (Person) o; //конкатенация. мы изменяем тип метода обджек чтобы он стал типом Персон

        boolean result = this.age == p.age && this.idCard == p.idCard && this.name.equals(p.name); // мы должны проверить каждое поле чтобы понять
        // равны объекты или нет
        // два обьекта будут равні тогда и только тогда когда у них будут равні айди карті
        // boolean result=(this.idCard==p.idCard);
        return result;
    }


    public static void main(String[] args) {
        Person person1 = new Person(11123, "Pavel", 23);
        Person person2 = new Person(11123, "Pavel", 23);


        //  boolean result=(person1==person2);  //  сравнивает ссылки на области памяти а не параметры объектов
        boolean result = person1.equals(person2);
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard=" + idCard +
                ", creditHistory=" + creditHistory +
                '}';
    }
}
