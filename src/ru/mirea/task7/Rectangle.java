package ru.mirea.task7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.length=0;
        this.width=0;
        this.color="wight";
        this.filled=false;
    }
    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
        this.color="wight";
        this.filled=false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){return this.width;}
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){return this.length;}
    public void setLength(double length) {
        this.length=length;
    }
    public double getArea(){return width*length;}
    public double getPerimeter(){return width*2+length*2;}
    public String toString(){return "width: "+width+", length: "+length+
            ", color: "+color+", filled: "+filled;}
}
