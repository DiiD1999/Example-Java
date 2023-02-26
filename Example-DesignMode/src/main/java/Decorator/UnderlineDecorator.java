package Decorator;

/**
 * @author DiiD
 */
public class UnderlineDecorator extends NodeDecorator {
    public UnderlineDecorator(TextNode target) {
        super(target);
    }

    /**
     * 获取文本
     *
     * @return
     */
    @Override
    public String getText() {
        return "<u>" + target.getText() + "</u>";
    }
}
