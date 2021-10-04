package ru.mirea.task10;

import java.util.Scanner;

public class Main7 {
    public static void recursion(long n, long i) {
        if (n==0){
            System.out.println("ноль не имеет делителей");
        }
        else if (i > n) {
            System.out.println("это все возможные делители");
        }
        else if (n%i==0) {
            System.out.println(i+"; ");
            recursion(n, i+1);
        }
        else {
            recursion(n, i+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("введите число: ");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println("делители числа: ");
        recursion(n, 1);
    }
}