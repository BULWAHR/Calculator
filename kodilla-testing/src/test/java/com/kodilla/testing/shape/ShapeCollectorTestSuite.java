package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import java.io.*;



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

        Shape retrievedShape = shapeCollector.getFigure(0);

        Assert.assertEquals(triangle, retrievedShape);

    }

    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();

        String square1 = "Square(3.5)";
        String triangle1 = "Triangle(2.5, 6.1)";
        String circle1 = "Circle(1.6)";

        String expectedListOfFigures = String.format("%s\n%s\n%s\n", square1, triangle1, circle1);

        Shape square2 = new Square(3.5);
        Shape triangle2 = new Triangle(2.5, 6.1);
        Shape circle2 = new Circle(1.6);

        shapeCollector.addFigure(square2);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(circle2);

        ByteArrayOutputStream temporaryString = new ByteArrayOutputStream();
        PrintStream temporaryList = new PrintStream(temporaryString);

        shapeCollector.showFigures(temporaryList);
        String actualListOfFigures = PrintStream.toString();

        Assert.assertEquals(expectedListOfFigures, actualListOfFigures);
    }
}


