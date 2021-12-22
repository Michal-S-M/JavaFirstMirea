package ru.mirea.Тask25;

public abstract class ShapeDecorator implements Shape {
    public final Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}