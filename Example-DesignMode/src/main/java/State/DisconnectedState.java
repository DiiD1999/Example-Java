package State;

/**
 * @author DiiD
 */
public class DisconnectedState implements State{
    @Override
    public String init() {
        return "Bye!";
    }

    @Override
    public String reply(String input) {
        return "";
    }
}
