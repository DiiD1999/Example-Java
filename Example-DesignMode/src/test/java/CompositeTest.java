import Composite.CommentNode;
import Composite.ElementNode;
import Composite.Node;
import Composite.TextNode;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void test() {
        Node root = new ElementNode("school");
        root.add(new ElementNode("classA")
                .add(new TextNode("Tom"))
                .add(new TextNode("Alice")));
        root.add(new ElementNode("classB")
                .add(new TextNode("Bob"))
                .add(new TextNode("Grace"))
                .add(new CommentNode("comment...")));
        System.out.println(root.toXml());
    }
}
