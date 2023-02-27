import TemplateMethod.AbstractSetting;
import TemplateMethod.LocalSetting;
import TemplateMethod.RedisSetting;
import org.junit.Test;

public class TemplateMethodTest {
    @Test
    public void test() {
        AbstractSetting setting1 = new LocalSetting();
        System.out.println("test = " + setting1.getSetting("test"));
        System.out.println("test = " + setting1.getSetting("test"));
        AbstractSetting setting2 = new RedisSetting();
        System.out.println("autosave = " + setting2.getSetting("autosave"));
        System.out.println("autosave = " + setting2.getSetting("autosave"));
    }
}
