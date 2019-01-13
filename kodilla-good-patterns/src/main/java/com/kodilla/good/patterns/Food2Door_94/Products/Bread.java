package com.kodilla.good.patterns.Food2Door_94.Products;

import com.kodilla.good.patterns.Food2Door_94.Product;

public class Bread extends Product {

    private String breadType;

    public Bread(String productName, String breadType) {
        super(productName);
        this.breadType = breadType;
    }
}