package ru.mirea.task5;

public class SugarBowl extends Dish {
    private double radius;
    private boolean fullOfSugar;

    public SugarBowl(String color, String type, double radius, boolean fullOfSugar){
        super(color, type);
        this.radius=radius;
        this.fullOfSugar=fullOfSugar;
    }
    public boolean checkFullOfSugar(){
        return fullOfSugar;
    }
    public void setFullOfSugar(boolean fullOfSugar){
        this.fullOfSugar=fullOfSugar;
    }
}
