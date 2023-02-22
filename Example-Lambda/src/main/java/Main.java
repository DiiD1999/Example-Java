import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author DiiD
 */
public class Main {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("a", 10));
        userList.add(new User("b", 1));
        userList.add(new User("c", 7));

        // 普通For打印List结构
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).toString());
        }

        // JavaLambda表达式打印List结构 ForEach方法
        userList.stream().forEach(System.out::println);

        // 转换字母大小
        userList.stream().
                map(user -> user.getName()).
                map(String::toUpperCase).
                forEach(System.out::println);
        // 年龄自加并转成List
        List<Integer> ageList = userList.stream().
                map(user -> user.getAge()).
                map(age-> age + 1).
                collect(Collectors.toList());
        // 打印
        ageList.stream().forEach(System.out::println);

        // sort排序
        ageList.stream().sorted().forEach(System.out::println);

        // reduce聚合
        System.out.println(ageList.stream().reduce(0, Integer::sum));
    }
}
