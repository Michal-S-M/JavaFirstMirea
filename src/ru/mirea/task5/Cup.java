package ru.mirea.task5;

public class Cup extends Dish {
    private double volume;
    private boolean full;

    public Cup(String color, String type, double volume, boolean full){
        super(color, type);
        this.volume=volume;
        this.full=full;
    }
    public boolean checkFull(){
        return full;
    }
    public void setFull(boolean full){
        this.full=full;
    }
}
