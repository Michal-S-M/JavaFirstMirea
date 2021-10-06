package ru.mirea.task5;


public abstract class Dish {
    private String color;
    private String type;
    private double salary;

    public String getColor() { return color; }
    public String getType() { return type; }
    public void setSalary(double salary) {
        this.salary=salary;
    }

    public Dish(String color, String type){
        this.color=color;
        this.type=type;
    }
    public void displayInfo(){
        System.out.println("Цвет: " + color + " вид: " + type + " цена " + salary);
    }
    public String toString(){
        return this.type+" "+this.color+ " цвета и стоимостью "+this.salary;
    }
}
