package Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 普通会员策略
 * @author DiiD
 */
public class UserDiscountStrategy implements DiscountStrategy {
    /**
     * 计算折扣额度
     *
     * @param total 当前总额
     * @return 计算后的总额
     */
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        // 普通会员打九折:
        return total.multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.DOWN);
    }
}