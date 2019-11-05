import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book theLaundryFiles;

    @Before
    public void before() {
        library = new Library();
        theLaundryFiles = new Book("The Laundry Files", "Charles Stross", "Horror");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBooksToLibrary() {
        assertEquals(1, library.countBooks());
    }
}
