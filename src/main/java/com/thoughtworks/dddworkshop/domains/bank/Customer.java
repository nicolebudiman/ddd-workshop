package com.thoughtworks.dddworkshop.domains.bank;

import java.util.List;

public class Customer extends Entity {
    private List<Account> accountList;
    private Address address;

    public Customer(List<Account> accountList, Address address) {
        this.accountList = accountList;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        this.accountList.forEach(account -> {
            account.updateAddress(newAddress);
        });
    }
}
