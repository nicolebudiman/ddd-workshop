package com.thoughtworks.dddworkshop.domains.domainService;

import com.thoughtworks.dddworkshop.domains.Price;

import java.util.Currency;
import java.util.HashMap;

public class CompetitorBasedPriceCalculator {
    private static final int discount = 10;
    static HashMap<String, Integer> priceMap = new HashMap<>();
    static {
        priceMap.put("iPad Pro", 1000);
    }

    public static Price calculatePrice(String productName) {

        int competitorPrice = priceMap.get(productName);
        int calculatedAmount = ((100 - discount) * competitorPrice)/100;

        return new Price(Currency.getInstance("USD"), calculatedAmount);
    }
}
