package FactoryMethod;

import java.math.BigDecimal;

/**
 * @author DiiD
 */
public class NumberFactoryImpl implements NumberFactory {
    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
