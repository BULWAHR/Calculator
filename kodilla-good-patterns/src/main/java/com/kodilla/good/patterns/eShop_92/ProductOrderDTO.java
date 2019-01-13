package com.kodilla.good.patterns.eShop_92;

import java.time.LocalDateTime;

public class ProductOrderDTO {

    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;
    private boolean isSold;

    public ProductOrderDTO(final LocalDateTime orderDate, final User user,final Product product, final int quantity, final boolean isSold) {

        this.orderDate = orderDate;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
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

    public boolean isSold() {
        return isSold;
    }
}
