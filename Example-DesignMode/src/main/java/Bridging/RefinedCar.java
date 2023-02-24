package Bridging;

/**
 * 重新组合构建所有车的结结构
 *
 * @author DiiD
 */
public abstract class RefinedCar extends Car {
    /**
     * 组合引擎加入
     *
     * @param engine 所使用的的引擎
     */
    public RefinedCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("Drive " + getBrand() + " car...");
    }

    public abstract String getBrand();
}
