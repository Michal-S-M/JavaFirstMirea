package ru.mirea.task2;

public class Book {
    private String name;
    private int page;
    private int ageRestrict;
    public Book(String name, int page, int ageRestrict){
        this.name=name;
        this.page=page;
        this.ageRestrict=ageRestrict;
    }

    public String toString(){
        return this.name+", page "+this.page;
    }
}
