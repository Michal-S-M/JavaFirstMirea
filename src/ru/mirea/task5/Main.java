package ru.mirea.task5;

public class Main {
    public static void main(String[] args) {
        Cup c1 = new Cup("green", "cup", 0.5, true);
        Bowl b1 = new Bowl("blue", "bowl", 4, false);
        c1.setSalary(5.2);
        c1.setSalary(6.6);
        c1.displayInfo();
        b1.displayInfo();
        SugarBowl sb1 = new SugarBowl("green", "cup", 0.5, true);
        sb1.setSalary(1.99);
        sb1.displayInfo();
    }
}
