package ru.mirea.task5;

public class Main {
    public static void main(String[] args) {
        Cup c1 = new Cup("green", "cup", 0.5, true);
        Bowl b1 = new Bowl("blue", "bowl", 4, false);
        c1.displayInfo();
        b1.displayInfo();
    }
}
