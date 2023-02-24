package Bridging;

/**
 * 华为
 *
 * @author DiiD
 */
public class HuaweiCar extends RefinedCar{
    public HuaweiCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Huawei";
    }
}
