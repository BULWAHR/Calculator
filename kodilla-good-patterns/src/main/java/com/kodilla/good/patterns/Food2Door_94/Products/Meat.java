package com.kodilla.good.patterns.Food2Door_94.Products;

import com.kodilla.good.patterns.Food2Door_94.Product;

public class Meat extends Product {

    private String meatType;

    public Meat(String productName, String meatType) {
        super(productName);
        this.meatType = meatType;
    }
}
