import FactoryMethod.NumberFactory;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test() {
        NumberFactory factory = NumberFactory.getFactory();
        Number result = factory.parse("123.456");
        System.out.println(result);
    }

    @Test
    public void staticTest(){
        Number result = NumberFactory.staticParse("123.456");
        System.out.println(result.getClass().toString() + ":" + result);
    }
}
