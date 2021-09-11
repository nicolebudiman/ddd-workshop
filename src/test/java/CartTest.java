import com.thoughtworks.dddworkshop.domains.*;
import org.junit.Test;

import java.util.Currency;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CartTest {


    @Test
    public void testAddProductToCart() {
        Cart cart = new Cart();
        String iPadPro = "IPad Pro";
        Product product = new Product(iPadPro, new Price(Currency.getInstance("USD"), 1000), 1);
        cart.add(product, 1);
        assertEquals(cart.getItems().get(0).getProduct().getName(), iPadPro);
        assertEquals(cart.getItems().get(0).getQuantity(), 1);
    }

    @Test
    public void testRemoveProductsToCart() {
        Cart cart = new Cart();
        String iPadPro = "IPad Pro";
        Product product = new Product(iPadPro, new Price(Currency.getInstance("USD"), 1000), 1);
        cart.add(product, 5);

        cart.remove(product, 1);
        assertEquals(4, cart.getItems().get(0).getQuantity());
    }

    @Test
    public void testGetProductionWasRemovedFromCart() {
        Cart cart = new Cart();
        String iPadPro = "IPad Pro";
        Product product = new Product(iPadPro, new Price(Currency.getInstance("USD"), 1000), 1);
        cart.add(product, 5);
//        PublicEvent(cart.remove())
        assertEquals(iPadPro, cart.remove(product, 1).getProduct().getName());
    }

    @Test
    public void testCompareTwoCart() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Item item1 = new Item(new Product("Ipad", new Price(Currency.getInstance("USD"), 1000), 1), 1);
        Item item2 = new Item(new Product("Ipad", new Price(Currency.getInstance("USD"), 1000), 1), 1);

        cart1.add(item1);
        cart2.add(item2);

        assertNotEquals(cart1, cart2);
        assertNotEquals(cart1.getId(), cart2.getId());
    }

    @Test
    public void testReturnPriceOfAProduct() {
        Cart cart1 = new Cart();

        Item item1 = new Item(new Product("Ipad", new Price(Currency.getInstance("USD"), 1000), 1), 1);

        assertEquals(item1.getProduct().getPrice().getAmount(), 1000);
        assertEquals(item1.getProduct().getPrice().getCurrency(), Currency.getInstance("USD"));

        cart1.add(item1);
    }

    @Test
    public void testCheckOutCartCreatesAnOrderWithProducts() {
        Cart cart1 = new Cart();

        Item item1 = new Item(new Product("Ipad", new Price(Currency.getInstance("USD"), 1000), 1), 1);
        cart1.add(item1);
        Order order = cart1.checkout();

        assertEquals(item1.getProduct().getName(), order.getItemList().get(0).getProduct().getName());
        assertEquals(item1.getQuantity(), order.getItemList().get(0).getQuantity());
    }
}
