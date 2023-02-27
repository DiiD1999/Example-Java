package TemplateMethod;

/**
 * 抽象设置
 * @author DiiD
 */
public abstract class AbstractSetting {

    public final String getSetting(String key) {
        String value = lookupCache(key);
        if (value == null) {
            value = readFromDatabase(key);
            System.out.println("[DEBUG] load from db: " + key + " = " + value);
            putIntoCache(key, value);
        } else {
            System.out.println("[DEBUG] load from cache: " + key + " = " + value);
        }
        return value;
    }

    /**
     * 抽象方法 待子类实现
     * @param key 关键字
     * @return 结果
     */
    protected abstract String lookupCache(String key);

    /**
     * 抽象方法 待子类实现
     * @param key 推入缓存key
     * @param value 值
     */
    protected abstract void putIntoCache(String key, String value);

    private String readFromDatabase(String key) {
        return Integer.toHexString(0x7fffffff & key.hashCode());
    }
}