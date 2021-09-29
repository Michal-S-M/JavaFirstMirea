package ru.mirea.task7;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        this.width=side;
        this.length=side;
        this.color="wight";
        this.filled=false;
    }
    public Square(double side, String color, boolean filled){
        this.width=side;
        this.length=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){return width;}
    public void setSide(double side){
        this.width=side;
        this.length=side;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length) {
        this.length=length;
    }

    public String toString() {
        return "width: "+width+ ", length: "+length+", color: "+", filled: "+ filled;
    }
}
