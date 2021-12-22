package ru.mirea.task1.opt3;

public class Task5 {
    public static void main(String[] args) {
        double x = 1, y;
        int a;
        for (int i = 0; i < 10; i++) {
            y = 1 / x;
            x++;
            a = i + 1;
            System.out.println("число номер " + a + " равно " + y);
        }
    }
}
