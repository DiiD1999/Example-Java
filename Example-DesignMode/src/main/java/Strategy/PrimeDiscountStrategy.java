package Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author DiiD
 */
public class PrimeDiscountStrategy implements DiscountStrategy {
    /**
     * 计算折扣额度
     *
     * @param total 当前总额
     * @return 计算后的总额
     */
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        return total.multiply(new BigDecimal("0.3")).setScale(2, RoundingMode.DOWN);
    }
}
