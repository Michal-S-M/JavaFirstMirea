package ru.mirea.Тask26;

import java.util.Scanner;

public class B1 implements Buying{
    public void pay() {
        System.out.println("укажите, что вам больше 18: ");
        String str, str0, str1;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("введите название товара: ");
        str0 = sc.nextLine();
        System.out.println("введите реквизиты банковской карты: ");
        str1 = sc.nextLine();
        System.out.println("с вами свяжутся: ");
    }
}
