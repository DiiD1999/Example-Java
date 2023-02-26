package Facade;

/**
 * @author DiiD
 */
public class Taxation {

    public String applyTaxCode(String companyId) {
        return String.format("1%015d", 0x7fffffff & companyId.hashCode());
    }
}
