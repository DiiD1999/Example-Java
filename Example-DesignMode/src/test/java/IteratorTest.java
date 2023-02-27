import Iterator.ReverseArrayCollection;
import org.junit.Test;

public class IteratorTest {
    @Test
    public void test(){
        ReverseArrayCollection<String> rarray = new ReverseArrayCollection<String>("apple", "pear", "orange", "banana");
        for (String fruit : rarray) {
            System.out.println(fruit);
        }
    }

}
