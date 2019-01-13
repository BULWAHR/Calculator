package com.kodilla.good.patterns.Food2Door_94.Orders;

import com.kodilla.good.patterns.Food2Door_94.Customer;
import com.kodilla.good.patterns.Food2Door_94.FoodSupplier;
import com.kodilla.good.patterns.Food2Door_94.Product;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private FoodSupplier foodSupplier;
    private Map<Product, Integer> productOrderRequest;


    public OrderRequest(Customer customer, FoodSupplier foodSupplier, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.foodSupplier = foodSupplier;
        this.productOrderRequest = productOrderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}
