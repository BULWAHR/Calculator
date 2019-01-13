package com.kodilla.good.patterns.eShop_92;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;

    public Product(String productName, String productDescription, BigDecimal productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return  "Item: " + productName +
                "\nDescription: " + productDescription +
                "\nPrice: " + productPrice + " zł";
    }
}