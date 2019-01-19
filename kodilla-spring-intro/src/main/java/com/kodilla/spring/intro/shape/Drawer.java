// Dependency Injection -
// klasa nie zarządza sama swoimi zależnościami (tworzenie obiektów).
// podawane są przez klasę zewnętrzną


package com.kodilla.spring.intro.shape;

public class Drawer {
    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}