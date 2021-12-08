package ru.mirea.Тask26;

import java.util.Scanner;

public class B2 implements Buying {
    public void pay(){
        System.out.println("Введите название больницы: ");
        String str, str1;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println("введите реквизиты банковской карты: ");
        str1=sc.nextLine();
        System.out.println("с вами свяжутся: ");
    }
}
