import AbstractFactory.AbstractFactory;
import AbstractFactory.FastFactory;
import AbstractFactory.HtmlDocument;
import AbstractFactory.WordDocument;
import AbstractFactory.GoodFactory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class AbstractFactoryTest {

    @Test
    public void test() throws IOException {
        AbstractFactory fastFactory = new FastFactory();
        HtmlDocument fastHtml = fastFactory.createHtml("#Hello\nHello, world!");
        System.out.println(fastHtml.toHtml());
        fastHtml.save(Paths.get(".", "fast.html"));
        WordDocument fastWord = fastFactory.createWord("#Hello\nHello, world!");
        fastWord.save(Paths.get(".", "fast.doc"));

        AbstractFactory goodFactory = new GoodFactory();
        HtmlDocument goodHtml = goodFactory.createHtml("#Hello\nHello, world!");
        System.out.println(goodHtml.toHtml());
        goodHtml.save(Paths.get(".", "good.html"));
        WordDocument goodWord = goodFactory.createWord("#Hello\nHello, world!");
        goodWord.save(Paths.get(".", "good.doc"));

    }
}
