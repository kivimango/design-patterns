package creational.singleton;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public final class StaticInnerClassSingletonTest {

    private StaticInnerClassSingleton firstInstance = StaticInnerClassSingleton.getInstance();
    private StaticInnerClassSingleton secondInstance = StaticInnerClassSingleton.getInstance();

    @Test
    public void testStaticInnerClassSingleton() {
        assertEquals(firstInstance, secondInstance);
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance instanceof StaticInnerClassSingleton);
    }

    @Test(expected=CloneNotSupportedException.class)
    public void testCloningShouldNotAllowed() throws CloneNotSupportedException {
        firstInstance.clone();
    }
}
