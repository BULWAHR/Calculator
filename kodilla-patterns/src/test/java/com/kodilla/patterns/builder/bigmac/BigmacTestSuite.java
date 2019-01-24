package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezam")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients("Cheese")
                .ingredients("Bacon")
                .ingredients("Cucumber")
                .build();

        int burgersQty = bigmac.getBurgers();
        int ingredientsQty = bigmac.getIngredients().size();

        Assert.assertEquals(2, burgersQty);
        Assert.assertEquals(3, ingredientsQty);
        Assert.assertTrue(bigmac.getIngredients().contains("Bacon"));
        Assert.assertFalse(bigmac.getIngredients().contains("Pepper"));
    }
}
