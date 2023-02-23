package Singleton;

/**
 * 第一种实现单例模式的方法
 *
 * @author DiiD
 */
public class SingletonFirst {
    public static final SingletonFirst INSTANCE = new SingletonFirst();

    /**
     * 返回已加载好的唯一实例
     * @return 唯一实例
     */
    public static SingletonFirst getInstance() {
        return INSTANCE;
    }

    /**
     *  private构造方法保证外部无法实例化:
     */
    private SingletonFirst() {

    }
}
