package AbstractFactory;

/**
 * @author DiiD
 */
public interface AbstractFactory {

    /**
     * 创建Word文档
     * @param md md文件
     * @return 结果
     */
    HtmlDocument createHtml(String md);

    /**
     * 创建Word文档
     * @param md md文件
     * @return 结果
     */
    WordDocument createWord(String md);

    /**
     * 创建指定工厂
     *
     * @param name 创建名
     * @return 结果
     */
    public static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}
