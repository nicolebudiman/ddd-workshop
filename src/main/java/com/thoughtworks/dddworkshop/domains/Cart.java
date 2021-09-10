package com.thoughtworks.dddworkshop.domains;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.abs;

public class Cart {
    private List<Item> items = new ArrayList<Item>();

    public void add(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Item remove(Product product, int i) {
        List<Item> removedItems = new ArrayList();
        items.forEach(item -> {
            if (product.getName() == item.getProduct().getName()) {
                item.setQuantity(abs(item.getQuantity() - i));
                removedItems.add(item);
            }
        });
        return removedItems.get(0);
    }
}
