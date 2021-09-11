package com.thoughtworks.dddworkshop.domains.bank;

import java.util.List;

public class Account extends Entity {
    private List<Account> accountList;
    private Address address;

    public Account(List<Account> accountList, Address address) {
        this.accountList = accountList;
        this.address = address;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
