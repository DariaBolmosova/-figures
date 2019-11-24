package OOPLesoon18_linkedlist;

import OOPLesson18.Person;

import java.util.Comparator;

public class PersonComporator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
       return o1.getAge() - o2.getAge();
    }
}
