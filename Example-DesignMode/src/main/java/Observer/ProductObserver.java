package Observer;

/**
 * @author DiiD
 */
public interface ProductObserver {

    void onPublished(Product product);

    void onPriceChanged(Product product);
}
