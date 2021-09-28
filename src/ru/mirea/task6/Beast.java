package ru.mirea.task6;

public class Beast implements Nameable {
    private String name;
    public String getName(){
        return this.name;
    }
    Beast(String name){
        this.name=name;
    }
}
