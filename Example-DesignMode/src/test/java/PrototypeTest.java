import Prototype.PrototypeStudent;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test() {
        PrototypeStudent prototypeStudent = new PrototypeStudent(1, "bob", 80);
        PrototypeStudent copyStudent = prototypeStudent.copy();
        System.out.println("Copy Student:" + copyStudent.toString());
    }
}
