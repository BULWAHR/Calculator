package com.kodilla.good.patterns.eShop_92;

import java.time.LocalDateTime;

interface ProductOrderService {
    boolean sold(LocalDateTime orderDate, User user, Product product, int quantity);
}
