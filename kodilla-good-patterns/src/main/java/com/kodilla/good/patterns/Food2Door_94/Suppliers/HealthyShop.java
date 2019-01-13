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

public class HealthyShop implements FoodSupplier {

    private Map<Product, Integer> productList;

    public HealthyShop() {
        productList = createProductList();
    }


    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new Bread("Roll", "extra fit"), 10);
        productList.put(new Meat("Exotic beef", "Kobe A5"), 1);
        productList.put(new Pizza("Corn Pizza", "sooo good"), 10);

        return productList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrders) {
        for (Map.Entry<Product, Integer> entry : productOrders.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(productList.get(entry.getKey()));
            if(productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("Product is unavailable at the moment in Healthy Shop.");
                return false;
            }
        }
        return true;
    }
}

