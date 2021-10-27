package ru.mirea.test;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> towns = new ArrayList<String>();
        towns.add("Москва");
        towns.add("Вашингтон");
        towns.add("Лондон");
        towns.add(2, "Детроит");
        towns.add("Омск");

        System.out.println(towns.get(2));

        System.out.printf("В списке %d элементов \n", towns.size());

        for (String state : towns) {
            System.out.println(state);
        }
        if (towns.contains("Лондон")) {
            System.out.println("Список содержит государство Лондон");
        }

        towns.remove("Вашингтон");
        towns.remove(0);
        Object[] countries = towns.toArray();

        for (Object country : countries) {
            System.out.println(country);
        }

        System.out.println("\n <<<<<<<<<<< \n");
        LinkedList<String> states = new LinkedList<String>();
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания");
        states.addFirst("Испания");
        states.add(1, "Италия");
        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");

        for (String state : states) {
            System.out.println(state);
        }

        if (states.contains("Германия")) {
            System.out.println("Список содержит государство Германия");
        }
        states.remove("Германия");
        states.removeFirst();
        states.removeLast();


        Task133<String> abc = new Task133<String>();
        abc.add("1");
        abc.add("2");
        abc.add("3");
    }
}
