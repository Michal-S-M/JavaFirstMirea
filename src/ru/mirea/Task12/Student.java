package ru.mirea.Task12;
public class Student {
    private int id, number;

    public Student(int id, int number) {
        this.id = id;
        this.number = number;
    }
    public int getID() {
        return id;
    }
    public String toString() {
        return "студент ["+number+"], с ID: "+id;
    }
}