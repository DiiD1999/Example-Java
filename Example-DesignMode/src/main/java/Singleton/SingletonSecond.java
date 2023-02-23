package Singleton;

/**
 * 第二种单例模式实现方式 枚举类
 *
 * @author DiiD
 */
public enum SingletonSecond {
    // Java的枚举类保证了实现就是单例模式
    INSTANCE;

    private String name = "SingletonSecond";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
