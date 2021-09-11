package com.thoughtworks.dddworkshop.domains;

import java.util.Currency;

public class Price {
    private Currency currency;
    private int amount;

    public Price(Currency currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }
}
