package ru.mirea.task10;
import java.util.Scanner;

public class Main6 {
    public static void recursion(double n, double i) {
        if ((n==0)||(n==1)){
            System.out.println("NO");
        }
        else if (i >= n) {
            System.out.println("YES");
        }
        else if (n%i==0) {
            System.out.println("NO");
        }
        else {
            recursion(n, i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println("введите число: ");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        recursion(n, 2);
    }
}
