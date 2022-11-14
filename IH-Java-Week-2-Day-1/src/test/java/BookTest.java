import com.ironhack.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {


    @Test
    void books_toString_works() {
        Book book = new Book("El Resplandor", 340);
        //"Book: title = " + title + " Number of pages: " + pages
        assertEquals("Book: title = El Resplandor Number of pages: 340", book.toString());
        assertTrue("Book: title = El Resplandor Number of pages: 340".equals(book.toString()));

    }
}
