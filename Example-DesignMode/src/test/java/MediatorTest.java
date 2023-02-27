import Mediator.OrderFrame;
import org.junit.Test;

public class MediatorTest {
    @Test
    public void test() {
        new OrderFrame("Hanburger", "Nugget", "Chip", "Coffee");
    }

    public static void main(String[] args) {
        new OrderFrame("Hanburger", "Nugget", "Chip", "Coffee");
    }
}
