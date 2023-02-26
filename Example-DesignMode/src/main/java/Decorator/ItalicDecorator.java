package Decorator;

/**
 * @author DiiD
 */
public class ItalicDecorator extends NodeDecorator {
    public ItalicDecorator(TextNode target) {
        super(target);
    }

    /**
     * 获取文本
     *
     * @return
     */
    @Override
    public String getText() {
        return "<i>" + target.getText() + "</i>";
    }
}
