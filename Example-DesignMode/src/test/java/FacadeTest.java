import Facade.*;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
        Facade facade = new Facade();
        Company c = facade.openCompany("Facade Software Ltd.");
        System.out.println(c);
    }
}
