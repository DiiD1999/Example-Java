package Bridging;

/**
 * 比亚迪轿车
 *
 * @author DiiD
 */
public class BYDCar extends RefinedCar {
    public BYDCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "BYD";
    }
}
