package ru.mirea.task2;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Shape S1 = new Shape("куб");
        Shape S2 = new Shape("пирамида", 19, "green");
        System.out.println(S2);
        System.out.println("введите объем куба: ");
        Scanner in = new Scanner(System.in);
        double num = in.nextInt();
        S1.setVolume(num);
        System.out.println("введите цвет куба: ");
        Scanner in1 = new Scanner(System.in);
        String color = in1.nextLine();
        S1.setColor(color);
        System.out.println(S1);

    }
}
