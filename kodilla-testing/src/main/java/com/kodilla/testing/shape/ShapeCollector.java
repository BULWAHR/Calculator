package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> listOfFigures = new ArrayList<>();

    public ShapeCollector() {
    }

    public int getShapeQuantity() {
        return listOfFigures.size();
    }

    public void addFigure(Shape shape) {
        if (shape != null) {
            listOfFigures.add(shape);
        }
    }

    public boolean removeFigure(Shape shape) {
        if (shape != null) {
            listOfFigures.remove(shape);
        }
        return false;
    }

    public Shape getFigure(int n) {
        return listOfFigures.get(n);
    }


    public void showFigures() {
            for (Shape shape : listOfFigures) {
            System.out.println(shape.toString());
        }
    }
}