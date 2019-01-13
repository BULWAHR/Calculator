package com.kodilla.good.patterns.eShop_92;

import java.time.LocalDateTime;
import java.util.Random;

public class ComputerOrderService implements ProductOrderService {

    @Override
    public boolean sold(LocalDateTime orderDate, User user, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}