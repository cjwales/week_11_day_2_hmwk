import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book theLaundryFiles;

    @Before
    public void before() {
        borrower = new Borrower();
        theLaundryFiles = new Book("The Laundry Files", "Charles Stross", "Horror");
    }

    @Test
    public void borrowerCanHaveBook() {
        borrower.addBook(theLaundryFiles);
        assertEquals(1, borrower.countBooks());
    }
}
