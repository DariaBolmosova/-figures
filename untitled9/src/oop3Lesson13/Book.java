package oop3Lesson13;

import java.util.Objects;

public class Book {
    public Author autor;
    private int maxPage;
    private String title;


    public Author getAutor() {
        return autor;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {

        Book book = (Book) o;
        boolean result = book.autor.equals(this.autor) && book.maxPage == this.maxPage && book.title.equals(this.title);
        return result;
    }


    public Book(String nameAuthor, int maxPage, String title) {
        this.autor = new Author(nameAuthor);
        this.maxPage = maxPage;
        this.title = title;
    }
}
