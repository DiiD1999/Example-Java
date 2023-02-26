package FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 *
 * @author DiiD
 */
public class Student {
    /**
     * 缓存
     */
    private static final Map<String, Student> cache = new HashMap<>();

    /**
     * 静态工厂方法
     * @param id id
     * @param name 姓名
     * @return 结果
     */
    public static Student create(int id, String name) {
        String key = id + "\n" + name;
        // 先查找缓存:
        Student std = cache.get(key);
        if (std == null) {
            // 未找到,创建新对象:
            System.out.println(String.format("create new Student(%s, %s)", id, name));
            std = new Student(id, name);
            // 放入缓存:
            cache.put(key, std);
        } else {
            // 缓存中存在:
            System.out.println(String.format("return cached Student(%s, %s)", std.id, std.name));
        }
        return std;
    }

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}