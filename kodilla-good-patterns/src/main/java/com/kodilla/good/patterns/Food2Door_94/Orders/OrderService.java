package com.kodilla.good.patterns.Food2Door_94.Orders;

import java.util.List;

public class OrderService {

    public void processOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("Order of " + n.getCustomer().getName() + " " + n.getCustomer().getSurname() + " is being processed.");
                    return n.getFoodSupplier().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order succesful: " + t + "\n"));
    }
}

