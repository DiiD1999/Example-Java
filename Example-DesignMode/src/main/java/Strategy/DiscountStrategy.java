package Strategy;

import java.math.BigDecimal;

/**
 * 策略模式案例
 * @author DiiD
 */
public interface DiscountStrategy {
    //
    /**
     * 计算折扣额度
     * @param total 当前总额
     * @return 计算后的总额
     */
    BigDecimal getDiscount(BigDecimal total);
}