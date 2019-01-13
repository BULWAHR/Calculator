package com.kodilla.good.patterns.Food2Door_94.Products;

import com.kodilla.good.patterns.Food2Door_94.Product;

public class Pizza extends Product {

    private String pizzaSize;

    public Pizza(String productName, String pizzaSize) {
        super(productName);
        this.pizzaSize = pizzaSize;
    }
}