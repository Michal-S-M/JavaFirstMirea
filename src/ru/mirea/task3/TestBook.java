package ru.mirea.task3;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Book B1 = new Book("Witcher", 301);
        Book B2 = new Book("Hurry Potter", 256, 13);
        System.out.println(B2);
        System.out.println("введите возрастной рейтинг Ведьмака: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        B1.setAgeRestrict(num);
        System.out.println(B1);
    }
}
