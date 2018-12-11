package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> listOfFigures = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        if (shape != null) {
            listOfFigures.add(shape);
        }
    }

    public void removeFigure(Shape shape) {
        if (shape != null) {
            listOfFigures.remove(shape);
        }
    }

    public Shape getFigure(int n) {
           if (n > 0 && n <= listOfFigures.size()) {
           listOfFigures.get(n);
        }
    // RETURN .........
    }

    // TUTAJ SIĘ TROCHĘ POGUBIŁEM
    public void showFigures() {
            for (String shape : ShapeCollector) {
            System.out.println(ShapeCollector <listOfFigures>);
        }
    }
}