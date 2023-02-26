package Decorator;

/**
 * 装饰器模式
 *
 * @author DiiD
 */
public interface TextNode {
    /**
     * 设置文本
     *
     * @param text
     */
    void setText(String text);

    /**
     * 获取文本
     *
     * @return
     */
    String getText();
}