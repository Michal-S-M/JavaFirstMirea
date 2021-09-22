package ru.mirea.task1.opt3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("введите число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int RightA=a;
        System.out.println("проверка работы метода: \n");
        for (int i = 1; i < a; i++) {
            System.out.println("шаг: "+i+"-ый; число: "+ RightA+" * "+1+"="+RightA*i+"\n");
            RightA=RightA*i;
        }
        System.out.println("искомое число: "+ RightA);
    }
}
