package task2.ex3;

public class Book {
    private int pages;
    private String author;
    private String name;

    public Book(int pages, String author, String name) {
        this.pages = pages;
        this.author = author;
        this.name = name;
    }

    public String toString() {
        return "Book{"
                + "pages='" + this.pages + '\''
                + ", author=" + this.author
                + ", name=" + this.name
                + '}';
    }

}
