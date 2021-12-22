package ru.mirea.task3;

public class Circle {
    private int R;
    private int length;

    public Circle(int R, int length){
        this.R=R;
        this.length=length;
    }
    public int getR(){
        return R;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length=length;
    }

    public int getPage(){
        return R;
    }

    public String toString(){
        return " радиус окружности равен "+ this.R+", длина: "+this.length;
    }
}
