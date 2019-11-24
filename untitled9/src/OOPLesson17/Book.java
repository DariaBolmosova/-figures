package OOPLesson17;

public class Book {
    private String name;
    private int maxPage;

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return (this.name.equals(book.name)) && (this.maxPage == book.maxPage);
    }

    public Book(String name, int maxPage) {
        this.name = name;
        this.maxPage = maxPage;
    }


    public static void main(String[] args) {
        Book book1 = new Book("GarryPotter1", 256);
        Book book2 = new Book("GarryPotter1", 256);

        if (book1.equals(book2)) {
            System.out.println("The books are equal");
        } else {
            System.out.println("The boom are not equal");
        }
    }
}
