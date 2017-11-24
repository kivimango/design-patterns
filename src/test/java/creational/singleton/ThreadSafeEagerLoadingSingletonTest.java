package creational.singleton;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public final class ThreadSafeEagerLoadingSingletonTest {

    private ThreadSafeEagerLoadingSingleton firstInstance = ThreadSafeEagerLoadingSingleton.getInstance();
    private ThreadSafeEagerLoadingSingleton secondInstance = ThreadSafeEagerLoadingSingleton.getInstance();

    @Test
    public void testThreadSafeEagerLoadingSingleton() {
        assertEquals(firstInstance, secondInstance);
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance instanceof ThreadSafeEagerLoadingSingleton);
    }

    @Test(expected=CloneNotSupportedException.class)
    public void testCloningShouldNotAllowed() throws CloneNotSupportedException {
        firstInstance.clone();
    }
}
