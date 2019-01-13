package com.kodilla.good.patterns.eShop_92;

public class ESHOPrunner {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ComputerOrderService(), new ComputerOrderDatabase());
        productOrderProcessor.process(productOrderRequest);
    }
}