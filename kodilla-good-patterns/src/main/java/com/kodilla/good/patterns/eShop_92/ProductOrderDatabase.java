package com.kodilla.good.patterns.eShop_92;

import java.time.LocalDateTime;

public interface ProductOrderDatabase {
    boolean createProductOrder(LocalDateTime orderDate, User user, Product product, int quantity);
}