import FlyWeight.Student;
import org.junit.Test;

public class FlyWeightTest {

    @Test
    public void test() {
        Student student1 = Student.create(1, "a");
        Student student2 = Student.create(2, "b");
        Student student3 = Student.create(2, "b");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
