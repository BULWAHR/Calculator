package com.kodilla.testing.shape;

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

        if (Double.compare(square.a, a) != 0) return false;
        return shapeName != null ? shapeName.equals(square.shapeName) : square.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
