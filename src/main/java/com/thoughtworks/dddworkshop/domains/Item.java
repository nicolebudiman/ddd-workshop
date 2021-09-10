package com.thoughtworks.dddworkshop.domains;

public class Item {
    public void setProduct(Product product) {
        this.product = product;
    }

    private Product product;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
