package FactoryMethod;

import java.math.BigDecimal;

/**
 * 静态工厂示例
 *
 * @author DiiD
 */
public interface NumberFactory {

    static NumberFactory impl = new NumberFactoryImpl();
    /**
     * 创建方法
     *
     * @param s 字符串参数
     * @return 字符串数字
     */
    Number parse(String s);

    /**
     * 获取工厂实例
     * @return
     */
    static NumberFactory getFactory(){
        return impl;
    }

    /**
     * 静态工厂方法
     * @param s 字符串参数
     * @return 字符串数字
     */
    public static Number staticParse(String s) {
        return new BigDecimal(s);
    }

}
