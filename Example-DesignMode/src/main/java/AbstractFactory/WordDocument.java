package AbstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author DiiD
 */
public interface WordDocument {
    void save(Path path) throws IOException;
}
