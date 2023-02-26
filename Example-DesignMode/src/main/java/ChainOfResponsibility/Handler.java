package ChainOfResponsibility;

/**
 * @author DiiD
 */
public interface Handler {

    Boolean process(Request request);
}
