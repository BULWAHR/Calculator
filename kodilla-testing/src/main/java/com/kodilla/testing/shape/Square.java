package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String shapeName = "square";
    private double a = 0;

    public void ShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, a);
    }
}
