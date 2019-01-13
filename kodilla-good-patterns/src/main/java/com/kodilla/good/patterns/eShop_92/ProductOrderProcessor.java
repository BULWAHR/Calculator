package com.kodilla.good.patterns.eShop_92;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderDatabase productOrderDatabase;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService,
                                 ProductOrderDatabase productOrderDatabase) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderDatabase = productOrderDatabase;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest) {
        boolean isSold = productOrderService.sold(productOrderRequest.getOrderDate(),
                productOrderRequest.getUser(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity());

        if (isSold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderDatabase.createProductOrder(productOrderRequest.getOrderDate(),
                    productOrderRequest.getUser(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
        } else {
            System.out.println("Your order was invalid, please try again later.");
        }

        return new ProductOrderDTO(productOrderRequest.getOrderDate(),
                productOrderRequest.getUser(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity(),
                isSold);
    }
}
