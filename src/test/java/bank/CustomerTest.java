package bank;

import com.thoughtworks.dddworkshop.domains.bank.Address;
import com.thoughtworks.dddworkshop.domains.bank.Customer;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomerCanUpdateAddress() {
        Customer customer = new Customer(Collections.emptyList(), new Address("Thailand"));

        customer.updateAddress(new Address("Singapore"));

        assertEquals("Singapore", customer.getAddress().getCity());
    }
}
