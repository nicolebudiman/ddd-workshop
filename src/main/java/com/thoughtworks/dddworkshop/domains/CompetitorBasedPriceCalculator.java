package com.thoughtworks.dddworkshop.domains;

public class CompetitorBasedPriceCalculator {
    public static Price calculatePrice(Price price, int percentDiscount) {
        return new Price(price.getCurrency(), price.getAmount()-(price.getAmount()*percentDiscount/100));
    }
}
