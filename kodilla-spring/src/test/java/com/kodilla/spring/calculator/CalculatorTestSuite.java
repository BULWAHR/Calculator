package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double add = calculator.add(24,15);
        double sub = calculator.sub(64, 27);
        double div = calculator.div(60, 7);
        double mul = calculator.mul(18, 34);

        Assert.assertEquals(39, add, 0.001);
        Assert.assertEquals(37, sub, 0.001);
        Assert.assertEquals(8.57142, div, 0.00001);
        Assert.assertEquals(612, mul, 0.001);
    }
}