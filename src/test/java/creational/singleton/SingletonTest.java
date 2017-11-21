package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class SingletonTest {

    @Test
    public void testSingletonShouldEqual() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        assertEquals(firstInstance, secondInstance);
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance instanceof Singleton);
    }

    @org.junit.Test(expected=CloneNotSupportedException.class)
    public void testCloningShouldbeNotAllowed() throws CloneNotSupportedException {
        Singleton instance = Singleton.getInstance();
        instance.clone();
    }

}
