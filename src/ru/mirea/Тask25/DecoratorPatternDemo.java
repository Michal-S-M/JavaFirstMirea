package ru.mirea.Тask25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rec = new Rectangle();
        rec.draw(); System.out.println();
        RedShapeDecorator redRec = new RedShapeDecorator(rec);
        redRec.draw(); System.out.println();
        Shape circle = new Circle();
        circle.draw(); System.out.println();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw(); System.out.println();
    }
}