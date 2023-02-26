import Command.*;
import org.junit.Test;

public class CommandTest {

    @Test
    public void test() {
        TextEditor editor = new TextEditor();
        editor.add("Command pattern in text editor.\n");
        Command copy = new CopyCommand(editor);
        copy.execute();
        editor.add("----\n");
        Command paste = new PasteCommand(editor);
        paste.execute();
        System.out.println(editor.getState());
    }
}
