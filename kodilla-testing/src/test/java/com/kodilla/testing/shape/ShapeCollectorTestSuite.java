package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;


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
        // stworzyłem 3 obiekty
        Shape square1 = new Square(3.5);
        Shape triangle1 = new Triangle(2.5, 6.1);
        Shape circle1 = new Circle(1.6);

        // umieściłem je w liście
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(circle1);

        // nie bardzo wiem jak dokończyć ten test
        // chodzi o test takiej samej ilości obiektów?
        // czy test sprawdzający czy są takie same figury?
    }
}


