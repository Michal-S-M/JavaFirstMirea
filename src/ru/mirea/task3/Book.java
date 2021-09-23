package ru.mirea.task3;

public class Book {
    private String name;
    private int page;
    private int ageRestrict;

    public Book(String name, int page, int ageRestrict){
        this.name=name;
        this.page=page;
        this.ageRestrict=ageRestrict;
    }

    public Book(String name, int page){
        this.name=name;
        this.page=page;
    }

    public String getName(){
        return name;
    }

    public int getAgeRestrict(){
        return ageRestrict;
    }

    public void setAgeRestrict(int ageRestrict){
        this.ageRestrict=ageRestrict;
    }

    public int getPage(){
        return page;
    }

    public String toString(){
        return this.name+", page "+this.page;
    }
}