import Bridging.*;
import org.junit.Test;

public class BridgingTest {

    @Test
    public void test() {
        // BYD 混动
        RefinedCar bydHybridCar = new BYDCar(new HybridEngine());
        bydHybridCar.drive();
        // BYD 油车
        RefinedCar bydFuelCar = new BYDCar(new FuelEngine());
        bydFuelCar.drive();
        // 华为油车
        RefinedCar huaweiFuelCar = new HuaweiCar(new FuelEngine());
        huaweiFuelCar.drive();
        // 华为混动
        RefinedCar huaweiHybridCar = new HuaweiCar(new HybridEngine());
        huaweiHybridCar.drive();
    }
}
