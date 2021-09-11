package com.thoughtworks.dddworkshop.domains;

import java.util.List;

public class Order {
    List<Item> itemList;
    private final static double SHIPPING_FEE_PER_GRAM = 0.01;

    public Order(List<Item> itemList) {
        this.itemList = itemList;
    }

    public double getTotalAmount() {
        int totalAmount = itemList.stream().reduce(0, (prev, item)  -> prev + (item.getProduct().getPrice().getAmount() * item.getQuantity()), Integer::sum);
        return totalAmount + getShippingCost();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    private double getShippingCost() {
        return itemList.stream().reduce(0.0, (prev, item)  -> prev + (item.getProduct().getWeight() * item.getQuantity() * SHIPPING_FEE_PER_GRAM), Double::sum);
    }

}
