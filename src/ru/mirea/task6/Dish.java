package ru.mirea.task6;

public class Dish implements Priceable{
    private int price;
    public int getPrice(){
        return this.price;
    }
    Dish(int price){
        this.price=price;
    }
}
