package Composite;

import java.util.List;

/**
 * @author DiiD
 */
public interface Node {

    /**
     * 添加一个节点为字节点
     *
     * @param node
     * @return
     */
    Node add(Node node);

    /**
     * 列出子节点
     * @return
     */
    List<Node> children();

    /**
     * 输出xml
     *
     * @return
     */
    String toXml();

}
