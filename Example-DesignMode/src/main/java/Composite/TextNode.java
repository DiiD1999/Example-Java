package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DiiD
 */
public class TextNode implements Node {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    @Override
    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> children() {
        return new ArrayList<Node>();
    }

    @Override
    public String toXml() {
        return text;
    }
}