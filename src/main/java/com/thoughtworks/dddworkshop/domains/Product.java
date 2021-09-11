package com.thoughtworks.dddworkshop.domains;

public class Product {
    private String name;
    private Price price;
    private double weight;

    public Product(String name, Price price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
