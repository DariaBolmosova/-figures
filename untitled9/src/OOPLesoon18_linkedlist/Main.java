package OOPLesoon18_linkedlist;

import OOPLesson18.Person;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       /* LinkedList LinkedList=new LinkedList();
        LinkedList.insertAfter("XXX");
        LinkedList.insertAfter("YYY");
        LinkedList.insertAfter("ZZZ");


        LinkedList.insertBefore("CCC");
        LinkedList.insertBefore("BBB");
        LinkedList.insertBefore("AAA");

        LinkedList.showAll();
        Node foundNode=LinkedList.find("BBB");

        System.out.println(foundNode.getPrev().getData());
        */
demoTreeSost();
    }

public  static void demoTreeSost(){
    TreeSet<Person> treeSet1=new TreeSet<>(new PersonComporator());


    Person p1=new Person(1123,"Pavel",24);
    Person p2=new Person(1123,"Alexl",25);
    Person p3=new Person(1123,"George",21);

   // treeSet1.add("ZZZ");
    //treeSet1.add("YYY");
    //treeSet1.add("XXX");
    treeSet1.add(p1);
    treeSet1.add(p2);
    treeSet1.add(p3);
    System.out.println(treeSet1);
}
}
