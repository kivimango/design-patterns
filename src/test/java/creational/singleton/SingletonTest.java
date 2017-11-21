package creational.singleton;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public final class SingletonTest {

    @Test
    public void testSingletonShouldEqual() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        assertEquals(firstInstance, secondInstance);
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance instanceof Singleton);
    }

    @Test(expected=CloneNotSupportedException.class)
    public void testCloningShouldbeNotAllowed() throws CloneNotSupportedException {
        Singleton instance = Singleton.getInstance();
        instance.clone();
    }

}
