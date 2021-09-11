package com.thoughtworks.dddworkshop.domains;

import java.util.List;

public class Order {
    List<Item> itemList;

    public Order(List<Item> itemList) {
        this.itemList
                = itemList
        ;
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
