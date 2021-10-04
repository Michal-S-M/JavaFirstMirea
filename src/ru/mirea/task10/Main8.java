package ru.mirea.task10;

import java.util.Scanner;

import java.util.Scanner;

public class Main8{
    public static void recursion(char[] str, int i) {
        if(str.length==1){
            System.out.println("слово состоит лишь из одного символа");
        }
        else if (((i==str.length/2)||(i==str.length/2-1))&&(str[i]==str[str.length-i-1])) {
            System.out.println("это палиндром");
        }
        else if (str[i]!=str[str.length-i-1]){
            System.out.println("это не палиндром");
        }
        else {
            recursion(str, i+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("введите слово: ");
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char[] str = n.toCharArray();
        recursion(str, 0);
    }
}
