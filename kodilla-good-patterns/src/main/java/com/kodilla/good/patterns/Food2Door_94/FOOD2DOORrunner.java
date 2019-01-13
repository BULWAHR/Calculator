package com.kodilla.good.patterns.Food2Door_94;

import com.kodilla.good.patterns.Food2Door_94.Orders.OrderRetriever;
import com.kodilla.good.patterns.Food2Door_94.Orders.OrderService;

public class FOOD2DOORrunner {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrders(new OrderRetriever().retrieve());
    }
}