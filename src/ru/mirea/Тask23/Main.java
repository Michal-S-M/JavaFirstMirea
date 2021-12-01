package ru.mirea.Тask23;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        String name;
        int yearOld;
        ArrayList<Doctors> doc = new ArrayList<>();
        doc.add(new Doctors("Who", 40, 543520));
        doc.add(new Doctors("Chaos", 6, 148348));
        doc.add(new Doctors("Bob N", 25, 223467));
        doc.add(new Doctors("Rasumovskiy", 27, 300821));
        doc.add(new Doctors("Nick B", 26, 854034));
        System.out.println("введите имя требуемого специалиста: ");
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
        System.out.println("введите возраст требуемого специалиста: ");
        yearOld=in.nextInt();
        boolean flag = false;

        Doctors d= new Doctors(name, yearOld, 0);
        for (int i = 0; i < doc.size(); i++) {
            if (d.hashCode() == doc.get(i).hashCode()) {
                System.out.println(doc.get(i).toString());
                flag=true;
            }
        }
        if (!flag) System.out.println("данного пользователя не существует");
    }
}
