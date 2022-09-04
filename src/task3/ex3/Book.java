package task3.ex3;

public class Book {
    private int pages;
    private String author;
    private String name;
    private int year;

    public Book(int pages, String author, String name, int year) {
        this.pages = pages;
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String pages) {
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String pages) {
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
