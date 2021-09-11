package com.thoughtworks.dddworkshop.domains.bank;

public class Account extends Entity {
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    protected void updateAddress(Address newAddress) {
        this.address = newAddress;
    }
}
