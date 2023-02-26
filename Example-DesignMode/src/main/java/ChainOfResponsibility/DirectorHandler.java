package ChainOfResponsibility;

import java.math.BigDecimal;

/**
 * @author DiiD
 */
public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0) {
            return null;
        }
        return !"alice".equalsIgnoreCase(request.getName());
    }
}
