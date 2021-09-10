import com.thoughtworks.dddworkshop.domains.Cart;
import com.thoughtworks.dddworkshop.domains.Item;
import com.thoughtworks.dddworkshop.domains.Product;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CartTest {


    @Test
    public void testAddProductToCart() {
        Cart cart = new Cart();
        String iPadPro = "IPad Pro";
        Product product = new Product(iPadPro);
        cart.add(product, 1);
        assertEquals(cart.getItems().get(0).getProduct().getName(), iPadPro);
        assertEquals(cart.getItems().get(0).getQuantity(), 1);
    }

    @Test
    public void testRemoveProductsToCart() {
        Cart cart = new Cart();
        String iPadPro = "IPad Pro";
        Product product = new Product(iPadPro);
        cart.add(product, 5);

        cart.remove(product, 1);
        assertEquals(4, cart.getItems().get(0).getQuantity());
    }

    @Test
    public void testGetProductionWasRemovedFromCart() {
        Cart cart = new Cart();
        String iPadPro = "IPad Pro";
        Product product = new Product(iPadPro);
        cart.add(product, 5);

        assertEquals(iPadPro, cart.remove(product, 1).getProduct().getName());

    }

    @Test
    public void testCompareTwoCart() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Item item1 = new Item(new Product("Ipad"), 1);
        Item item2 = new Item(new Product("Ipad"), 1);

        cart1.add(item1);
        cart2.add(item2);

        assertNotEquals(cart1, cart2);
    }
}
