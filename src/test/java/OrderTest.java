import com.sun.tools.javac.util.List;
import com.thoughtworks.dddworkshop.domains.Item;
import com.thoughtworks.dddworkshop.domains.Order;
import com.thoughtworks.dddworkshop.domains.Product;
import com.thoughtworks.dddworkshop.domains.domainService.CompetitorBasedPriceCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void testShouldCalculateCostBasedOnItemsAndShippingCost() {
        List<Item> itemList = List.of(new Item(new Product("iPad Pro", CompetitorBasedPriceCalculator.calculatePrice("iPad Pro"), 100), 2));

        Order order = new Order(itemList);
        assertEquals(1802.0, order.getTotalAmount(), 0.01);
    }
}