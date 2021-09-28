package ru.mirea.task6;

public class Planet implements Nameable {
    private String name;
    public String getName(){
        return this.name;
    }
    Planet(String name){
        this.name=name;
    }
}
