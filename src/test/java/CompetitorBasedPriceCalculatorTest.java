import com.thoughtworks.dddworkshop.domains.CompetitorBasedPriceCalculator;
import com.thoughtworks.dddworkshop.domains.Price;
import com.thoughtworks.dddworkshop.domains.Product;
import org.junit.Test;

import java.util.Currency;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CompetitorBasedPriceCalculatorTest {

    @Test
    public void shouldPriceProduct10PercentLowerThanCompetitor() {
        HashMap<String, Integer> priceMap = new HashMap<>();

        priceMap.put("iPad Pro", 1000);

        Price price = new Price(Currency.getInstance("USD"), 1000);

        Product product = new Product("iPad Pro", CompetitorBasedPriceCalculator.calculatePrice(price,10));

        assertEquals(900, product.getPrice().getAmount());
    }
}
