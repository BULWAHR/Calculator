package com.kodilla.good.patterns.eShop_92;

import java.time.LocalDateTime;
import java.util.Random;


public class ComputerOrderDatabase implements ProductOrderDatabase {

    @Override
    public boolean createProductOrder(LocalDateTime orderDate, User user, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}