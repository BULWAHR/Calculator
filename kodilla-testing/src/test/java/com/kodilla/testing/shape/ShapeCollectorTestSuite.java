package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(2.5, 6.1);

        shapeCollector.addFigure(triangle);

        Assert.assertEquals(1, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(2.5, 6.1);

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(2.5, 6.1);

        shapeCollector.addFigure(triangle);
        Shape retrievedShape = shapeCollector.getFigure(0);

        Assert.assertEquals(triangle, retrievedShape);

    }

    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square2 = new Square(3.5);
        Shape triangle2 = new Triangle(2.5, 6.1);
        Shape circle2 = new Circle(1.6);

        shapeCollector.addFigure(square2);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(circle2);

        List<Shape> list = new ArrayList<>();
        list.add(square2);
        list.add(triangle2);
        list.add(circle2);

        Assert.assertEquals(shapeCollector.getFigures(), list);
    }
}



