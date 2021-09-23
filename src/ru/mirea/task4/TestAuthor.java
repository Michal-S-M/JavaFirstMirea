package ru.mirea.task4;
import java.util.Scanner;

public class TestAuthor{
    public static void main(String[] args) {
        Author a1 = new Author("Nik", "123@gmail.com", 'm' );
        System.out.println(a1);
        Author a2 = new Author("Sam", "", 'm' );
        Scanner in = new Scanner(System.in);
        System.out.println("введите эллектронную почту Сэма: ");
        String num = in.nextLine();
        a2.setEmail(num);
        System.out.println(a2);
    }
}