package com.thoughtworks.dddworkshop.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.lang.StrictMath.abs;

public class Cart {
    private UUID id;
    private List<Item> items = new ArrayList<Item>();
    private boolean isCheckedOut = false;

    public Cart() {
        this.id = UUID.randomUUID();
    }

    public List<Item> getItems() {
        return items;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cart)) {return false;}
        Cart incomingCart = (Cart)obj;
        return incomingCart.id == this.id;
    }

    public void add(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public void add(Item item) {
        items.add(item);
    }
    public Item remove(Product product, int i) {
        List<Item> removedItems = new ArrayList();
        items.forEach(item -> {
            if (product.getName() == item.getProduct().getName()) {
                item.setQuantity(abs(item.getQuantity() - i));
                removedItems.add(item);
            }
        });
        // publishEvent(remove); //Break SOLID
        return removedItems.get(0);
    }

    public Order checkout() {
        this.isCheckedOut = true;
        return new Order(items);
    }
}
