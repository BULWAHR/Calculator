package com.kodilla.good.patterns.eShop_92;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private LocalDateTime orderDate;
    private User user;
    private Product product;
    private int quantity;


    public ProductOrderRequest(LocalDateTime orderDate, User user, Product product, int quantity) {
        this.orderDate = orderDate;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}