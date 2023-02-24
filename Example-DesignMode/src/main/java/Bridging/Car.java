package Bridging;

/**
 * 桥接模式示例
 *
 * @author DiiD
 */
public abstract class Car {
    // 引用Engine:
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
