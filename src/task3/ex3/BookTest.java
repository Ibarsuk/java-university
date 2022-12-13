package task3.ex3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book(356, "Geirodhar", "Freya", 1165);

        System.out.println(book);

        book.setPages(355);
        book.setAuthor("Phrey");
        book.setName("Deya");
        book.setYear(1065);

        System.out.println(book);
    }
}
