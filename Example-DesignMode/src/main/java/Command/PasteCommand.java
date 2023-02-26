package Command;

/**
 * 粘贴命令
 *
 * @author DiiD
 */
public class PasteCommand implements Command {

    private TextEditor receiver;

    public PasteCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paste();
    }
}
