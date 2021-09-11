package domainService;

import com.thoughtworks.dddworkshop.domains.domainService.CompetitorBasedPriceCalculator;
import com.thoughtworks.dddworkshop.domains.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompetitorBasedPriceCalculatorTest {

    @Test
    public void shouldPriceProduct10PercentLowerThanCompetitor() {
        String productName = "iPad Pro";
        Product product = new Product(productName, CompetitorBasedPriceCalculator.calculatePrice(productName));

        assertEquals(900, product.getPrice().getAmount());
    }
}
