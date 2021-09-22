package ru.mirea.task2;

public class Shape {
    private String name;
    private double volume;
    private String color;

    public Shape(String name, double volume, String color){
        this.name=name;
        this.volume=volume;
        this.color=color;
    }

    public Shape(String name){
        this.name=name;
        this.volume=0;
        this.color = "";
    }

    public String getName(){
        return name;
    }

    public void setVolume(double volume){
        this.volume=volume;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String toString(){
        return this.name+", объемом "+this.volume+", и цветом "+this.color;
    }

}
