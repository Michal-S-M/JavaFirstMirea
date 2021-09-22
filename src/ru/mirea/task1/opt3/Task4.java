package ru.mirea.task1.opt3;

public class Task4 {
    public static void main(int nomber, String[] args) {
        System.out.println( "Всего "+nomber+" аргументов:\n");
        for (int count = 0; count < nomber; ++count) {
            System.out.println(count + " " + args[count] + '\n');
        }
    }
}
