package com.kodilla.good.patterns.Food2Door_94.Suppliers;

import com.kodilla.good.patterns.Food2Door_94.Customer;
import com.kodilla.good.patterns.Food2Door_94.FoodSupplier;
import com.kodilla.good.patterns.Food2Door_94.Product;
import com.kodilla.good.patterns.Food2Door_94.Products.Bread;
import com.kodilla.good.patterns.Food2Door_94.Products.Meat;
import com.kodilla.good.patterns.Food2Door_94.Products.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodSupplier {

    private Map<Product, Integer> productList;

    public ExtraFoodShop() {
        productList = createProductList();
    }


    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new Bread("Loaf", "whole grain"), 10);
        productList.put(new Meat("Beef", "steak"), 5);
        productList.put(new Meat("Wild meat", "deer"), 4);
        productList.put(new Pizza("5 cheeses", "extra special"), 2);

        return productList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrders) {
        for (Map.Entry<Product, Integer> entry : productOrders.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(productList.get(entry.getKey()));
            if(productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("Product is unavailable at the moment in Extra Food Shop.");
                return false;
            }
        }
        return true;
    }
}
