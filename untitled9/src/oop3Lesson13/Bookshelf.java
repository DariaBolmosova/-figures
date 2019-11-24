package oop3Lesson13;

public class Bookshelf {
    private Book[]books;                          //private Book[]books=new Book[10];
    private int counter;

    public Bookshelf(int len){
        this.books=new Book[10];
    }


    public void put(Book book){
        if(counter<books.length){
        books[counter++]=book;}
        else {
            System.out.println("vse");
        }
    }
}
