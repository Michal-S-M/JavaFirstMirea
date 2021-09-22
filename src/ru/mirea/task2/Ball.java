package ru.mirea.task2;

public class Ball {
    private String color;
    private float rad;

    public Ball(String color, float rad){
        this.color=color;
        this.rad=rad;
    }

    public String toString(){
        return "color "+this.color+", rad = "+this.rad;
    }

    public void setRad(float rad){
        this.rad=rad;
    }
}
