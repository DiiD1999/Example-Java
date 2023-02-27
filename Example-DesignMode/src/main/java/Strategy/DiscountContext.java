package Strategy;

import java.math.BigDecimal;

/**
 * 应用策略
 *
 * @author DiiD
 */
public class DiscountContext {
    /**
     * 持有某个默认策略:
     */
    private DiscountStrategy strategy = new UserDiscountStrategy();

    /**
     * 更新策略
     * @param strategy 设置新策略
     */
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculatePrice(BigDecimal total) {
        return total.subtract(this.strategy.getDiscount(total)).setScale(2);
    }
}
