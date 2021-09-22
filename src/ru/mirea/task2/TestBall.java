package ru.mirea.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball B1 = new Ball("black", 30);
        System.out.println(B1);
        System.out.println("введите радиус шара: ");
        Scanner in = new Scanner(System.in);
        float rad = in.nextInt();
        B1.setRad(rad);
        System.out.println(B1);
    }
}
