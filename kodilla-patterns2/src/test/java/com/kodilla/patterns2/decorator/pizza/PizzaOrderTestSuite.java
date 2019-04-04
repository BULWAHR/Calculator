package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testDoubleSizeWithExtraCheeseCost() {

        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        BigDecimal theCost = theOrder.getCost();
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testDoubleSizeWithExtraCheeseDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        String description = theOrder.getDescription();
        assertEquals("Margerita, double size with extra cheese", description);
    }

    @Test
    public void testPizzaWithAllOptionsCost() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        BigDecimal theCost = theOrder.getCost();
        assertEquals(new BigDecimal(48), theCost);
    }

    @Test
    public void testPizzaWithAllOptionsDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleSizeDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        String description = theOrder.getDescription();
        System.out.println(description);
        assertEquals("Margerita, double size with salami with extra cheese, for delivery", description);
    }
}