import Builder.URLBuilder;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BuilderTest {

    @Test
    public void test() {
        String url = URLBuilder.builder() // 创建Builder
                .setDomain("www.liaoxuefeng.com") // 设置domain
                .setScheme("https") // 设置scheme
                .setPath("/") // 设置路径
                .setQuery(new HashMap<String, String>() {{
                                  put("a", "123");
                                  put("q", "K&R");
                              }
                          }) // 设置query
                .build(); // 完成build
        System.out.println(url);
    }
}
