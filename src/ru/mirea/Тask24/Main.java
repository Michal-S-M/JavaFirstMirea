package ru.mirea.Тask24;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        String name, login, password, phone;
        Pattern namePattern = Pattern.compile("^[a-zA-Z]{2,25}$");
        Pattern phonePattern = Pattern.compile("^[0-9]{9,15}$");
        Pattern loginPattern = Pattern.compile("\\w*");
        Pattern passwordPattern = Pattern.compile("[A-Za-z0-9]{6,}$");
        boolean flag = true;
        while (flag) {
            System.out.print("Имя: ");
            name = in.nextLine();
            if (!namePattern.matcher(name).matches())
                System.out.println("Имя набрано неверно\n");
            else
            {
                System.out.print("phone: ");
                phone = in.next();
                if (!phonePattern.matcher(phone).matches())
                    System.out.println("Телефон набран неверно\n");
                else {
                    System.out.print("Логин: ");
                    Scanner in1 = new Scanner(System.in);
                    login = in1.nextLine();
                    if (!loginPattern.matcher(login).matches())
                    System.out.println("Логин набран неверно\n");
                    else {
                        System.out.print("Пароль: ");
                        password = in.next();
                        if (!passwordPattern.matcher(password).matches())
                            System.out.println("Пароль набран неверно\n");
                        else {
                            User user = new User(name, phone, login, password);
                            users.add(user);
                            flag = false;
                            System.out.println(user.tpString());
                        }
                    }
                }
            }
        }
    }
}
