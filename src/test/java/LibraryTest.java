import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book theLaundryFiles;

    @Before
    public void before() {
        library = new Library(5);
        theLaundryFiles = new Book("The Laundry Files", "Charles Stross", "Horror");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBooksToLibrary() {
        library.addBook(theLaundryFiles);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void doesNotExceedCapacity() {
        library.addBook(theLaundryFiles);
        library.addBook(theLaundryFiles);
        library.addBook(theLaundryFiles);
        library.addBook(theLaundryFiles);
        library.addBook(theLaundryFiles);
        library.addBook(theLaundryFiles);
        assertEquals(5, library.countBooks());
    }
}
