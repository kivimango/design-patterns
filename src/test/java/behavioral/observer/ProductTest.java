package behavioral.observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class ProductTest {

    private Product product;
    private Customer customer;

    @Before
    public final void setup() {
        product = new Product("IntelliJ IDEA", false);
        customer = new Customer("spendalot@rich.com");
        product.addObserver(customer);
    }

    @After
    public final void teardown() {
        product = null;
        customer = null;
    }

    @Test
    public final void testAddObserver() {
        assertEquals(1, product.countObservers());
    }

    @Test
    public final void testDuplicateObserver() {
        product.addObserver(customer);
        assertEquals(1, product.countObservers());
    }

    @Test
    public final void testNotify() {
        product.setInStock(true);
    }

    @Test
    public final void testDeleteObserver() {
        product.deleteObserver(customer);
        assertEquals(0, product.countObservers());
    }

    @Test
    public final void testDeleteAllObserver() {
        product.deleteObservers();
        assertEquals(0, product.countObservers());
    }

}
