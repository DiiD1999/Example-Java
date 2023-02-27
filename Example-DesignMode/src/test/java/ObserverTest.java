import Observer.*;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Admin a = new Admin();
        Customer c = new Customer();
        // store:
        Store store = new Store();
        // register:
        store.addObserver(a);
        store.addObserver(c);
        // 注册匿名观察者:
        store.addObserver(new ProductObserver() {
            @Override
            public void onPublished(Product product) {
                System.out.println("[Log] on product published: " + product);
            }

            @Override
            public void onPriceChanged(Product product) {
                System.out.println("[Log] on product price changed: " + product);
            }
        });
        // operation:
        store.addNewProduct("Design Patterns", 35.6);
        store.addNewProduct("Effective Java", 50.8);
        store.setProductPrice("Design Patterns", 31.9);
    }
}
