package com.kodilla.good.patterns.eShop_92;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        LocalDateTime orderDate = LocalDateTime.of(2018, 1, 15, 13, 48);
        User user = new User("-The Little-", "John", "Smith");
        Product product = new Computer("Computer",
                "High-end specification",
                new BigDecimal("7950"));
        int quantity = 1;

        System.out.println("Order for: " + user.getName() + " " + user.getNickname() + " " + user.getSurname());
        System.out.println("\nDate: " + orderDate);
        System.out.println("\n" + product + "\nQuantity: " + quantity + "\n");

        return new ProductOrderRequest(orderDate, user, product, quantity);
    }
}

