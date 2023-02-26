import Decorator.*;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new UnderlineDecorator(new SpanNode()));
        TextNode n3 = new ItalicDecorator(new BoldDecorator(new SpanNode()));
        n1.setText("Hello");
        n2.setText("Decorated");
        n3.setText("World");
        System.out.println(n1.getText());
        System.out.println(n2.getText());
        System.out.println(n3.getText());
    }
}
