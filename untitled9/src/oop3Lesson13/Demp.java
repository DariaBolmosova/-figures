package oop3Lesson13;

public class Demp {
    public static void main(String[] args) {
        Bookshelf bookshelf=new Bookshelf(15);

        Book book1=new Book("pushkin",600,"Captain daughter");
        Book book2=new Book("pushkin",600,"Ruslan i Ludmila");

        bookshelf.put(book1);
        bookshelf.put(book2);
    }
}
