package com.kodilla.good.patterns.Food2Door_94.Orders;

import com.kodilla.good.patterns.Food2Door_94.Customer;
import com.kodilla.good.patterns.Food2Door_94.FoodSupplier;
import com.kodilla.good.patterns.Food2Door_94.Product;
import com.kodilla.good.patterns.Food2Door_94.Products.Bread;
import com.kodilla.good.patterns.Food2Door_94.Products.Meat;
import com.kodilla.good.patterns.Food2Door_94.Products.Pizza;
import com.kodilla.good.patterns.Food2Door_94.Suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door_94.Suppliers.HealthyShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer1 = new Customer("John",  "Smith");
        FoodSupplier foodSupplier1 = new ExtraFoodShop();
        Map<Product, Integer> productList1 = new HashMap<>();
        productList1.put(new Bread("Loaf", "whole grain"), 2);
        productList1.put(new Meat("Wild meat", "deer"), 1);
        productList1.put(new Pizza("5 cheeses", "extra special"), 1);

        Customer customer2 = new Customer("Ann",  "Smith");
        FoodSupplier foodSupplier2 = new HealthyShop();
        Map<Product, Integer> productList2 = new HashMap<>();
        productList2.put(new Meat("Exotic beef", "Kobe A5"), 1);
        productList2.put(new Pizza("Corn pizza", "soo good"), 3);


        orderRequestList.add(new OrderRequest(customer1, foodSupplier1, productList1));
        orderRequestList.add(new OrderRequest(customer2, foodSupplier2, productList2));

        return orderRequestList;
    }
}


