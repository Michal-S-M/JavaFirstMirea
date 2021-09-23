package ru.mirea.task5;

public class Bowl extends Dish {
    private double rad;
    private boolean full;

    public Bowl(String color, String type, double rad, boolean full) {
        super(color, type);
        this.rad=rad;
        this.full=full;
    }
    public void setRad(double rad){
        this.rad=rad;
    }
}
