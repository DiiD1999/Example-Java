package AbstractFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * @author DiiD
 */
public class FastHtmlDocument implements HtmlDocument {

    private String md;

    public FastHtmlDocument(String md) {
        this.md = md;
    }

    @Override
    public String toHtml() {
        return Arrays.stream(md.split("\n")).map(s -> {
            if (s.startsWith("#")) {
                return "<h1>" + s.substring(1) + "</h1>";
            }
            return "<p>" + s + "</p>";
        }).reduce("", (acc, s) -> acc + s + "\n");
    }

    @Override
    public void save(Path path) throws IOException {
        Files.write(path, toHtml().getBytes("UTF-8"));
    }
}
