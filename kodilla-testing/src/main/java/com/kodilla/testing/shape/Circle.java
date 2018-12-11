package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "circle";
    private double r = 0;

    public void ShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Circle (double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getField() {
        return Math.PI * r * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        return shapeName != null ? shapeName.equals(circle.shapeName) : circle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}