package AbstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author DiiD
 */
public interface HtmlDocument {
    String toHtml();
    void save(Path path) throws IOException;
}
