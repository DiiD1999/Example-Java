package ChainOfResponsibility;

/**
 * @author DiiD
 */
public class CEOHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        if ("Bill".equalsIgnoreCase(request.getName())) {
            return false;
        }
        return true;
    }
}
