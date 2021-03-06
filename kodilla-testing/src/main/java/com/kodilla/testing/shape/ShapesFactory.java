package com.kodilla.testing.shape;

import java.util.Random;

public class ShapesFactory {

    public Square createSquare() {
        return new Square();
    }


    public Shape chosenShape() {
        Shape theShape;
        Random generator = new Random();
        int chosen = generator.nextInt(3);
        if (chosen == 0) {
            theShape = new Triangle();
        } else if (chosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}