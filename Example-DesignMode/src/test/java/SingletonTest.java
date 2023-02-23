import Singleton.SingletonFirst;
import Singleton.SingletonSecond;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonFirst() {
        SingletonFirst singletonFirst = SingletonFirst.getInstance();
        System.out.println(singletonFirst.getClass());
    }

    @Test
    public void testSingletonSecond() {
        String name = SingletonSecond.INSTANCE.getName();
        System.out.println(name);
    }
}
