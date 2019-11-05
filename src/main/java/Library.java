import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (countBooks() < this.capacity)
        this.books.add(book);
    }

    public void lendBook(Book book, Borrower borrower) {
        borrower.addBook(book);
    }
}
