package bank;

import com.sun.tools.javac.util.List;
import com.thoughtworks.dddworkshop.domains.bank.Account;
import com.thoughtworks.dddworkshop.domains.bank.Address;
import com.thoughtworks.dddworkshop.domains.bank.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomerCanUpdateAddress() {
        Customer customer = new Customer(List.of(new Account(new Address("Thailand"))), new Address("Thailand"));

        customer.updateAddress(new Address("Singapore"));

        assertEquals("Singapore", customer.getAddress().getCity());
        assertEquals("Singapore", customer.getAccountList().get(0).getAddress().getCity());
    }
}
