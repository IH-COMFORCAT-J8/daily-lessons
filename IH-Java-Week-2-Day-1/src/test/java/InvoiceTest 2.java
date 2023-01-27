import com.ironhack.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {

    InvoiceItem item1;
    InvoiceItem item2;
    ArrayList<InvoiceItem> itemList = new ArrayList<>();

    Invoice invoice;

    @BeforeEach
    void setup() {
        System.out.println("Hola");
        item1 = new InvoiceItem("Ron", "15");
        item2 = new InvoiceItem("Coca Cola", "2");
        invoice = new Invoice("IH-001", 17.0, false, itemList);
        itemList.add(item1);
        itemList.add(item2);

    }

    @AfterEach
    void tearDown() {
        System.out.println("Adiós");
        itemList = new ArrayList<>();
    }

    @Test
    void addElement_list_success() {
        System.out.println("Test 1");

        invoice.addInvoiceItem(new InvoiceItem("Hielo", "3"));

        assertEquals(3, invoice.getInvoiceItems().size());

        ArrayList<InvoiceItem> invoiceResult = invoice.getInvoiceItems();
        InvoiceItem itemResult = invoiceResult.get(2);

        assertEquals("Hielo", itemResult.getName());

    }

    @Test
    void addFiveElementsSuccess() {
        System.out.println("Test 2");
        invoice.addInvoiceItem(new InvoiceItem("Hielo", "3"));
        invoice.addInvoiceItem(new InvoiceItem("Hielo", "3"));
        invoice.addInvoiceItem(new InvoiceItem("Hielo", "3"));
        invoice.addInvoiceItem(new InvoiceItem("Hielo", "3"));
        invoice.addInvoiceItem(new InvoiceItem("Hielo", "3"));
        assertEquals(7, invoice.getInvoiceItems().size());


    }
}
