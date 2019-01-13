package com.kodilla.good.patterns.Food2Door_94;

import java.util.Map;


public interface FoodSupplier {

    boolean process(Customer customer, Map<Product, Integer> productOrders);

}
