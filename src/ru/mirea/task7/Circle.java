package ru.mirea.task7;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.radius=0;
        this.color="wight";
        this.filled=false;
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="wight";
        this.filled=false;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius=radius;}
    public double getArea(){return Math.PI*Math.pow(radius, 2)/2;}
    public double getPerimeter(){return Math.PI*2*radius;}
    public String toString(){return"radius: "+ this.radius+", color: "+this.color+
            ", filled: " + filled;}
}
