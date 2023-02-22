package AbstractFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * @author DiiD
 */
public class GoodHtmlDocument implements HtmlDocument {

    private String md;

    public GoodHtmlDocument(String md) {
        this.md = md;
    }

    @Override
    public String toHtml() {
        String body = Arrays.stream(md.split("\n")).map(s -> {
            if (s.startsWith("#")) {
                return "<h1>" + s.substring(1) + "</h1>";
            }
            return "<p>" + s + "</p>";
        }).reduce("", (acc, s) -> acc + s + "\n");
        return "<html>\n<body>\n" + body + "\n</body>\n</html>";
    }

    @Override
    public void save(Path path) throws IOException {
        Files.write(path, toHtml().getBytes("UTF-8"));
    }
}
