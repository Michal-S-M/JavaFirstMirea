package ru.mirea.test;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> towns = new ArrayList<String>();
// добавим в список ряд элементов
        towns.add("Москва");
        towns.add("Вашингтон");
        towns.add("Лондон");
        towns.add("Омск");
        towns.add(1, "Детроит"); // добавляем элемент по индексу 1
        System.out.println(towns.get(1));// получаем 2-й объект
        towns.set(1, "Мурманск"); // установка нового значения для 2-го объекта
        System.out.printf("В списке %d элементов \n", towns.size());
        for (String state : towns) {
            System.out.println(state);
        }
        if (towns.contains("Лондон")) {
            System.out.println("Список содержит государство Лондон");
        }// удалим несколько объектов
        towns.remove("Вашингтон");
        towns.remove(0);
        Object[] countries = towns.toArray();
        for (Object country : countries) {
            System.out.println(country);
        }
        System.out.println("\n <<<<<<<<<<< \n");
        LinkedList<String> states = new LinkedList<String>();
// добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1
        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for (String state : states) {
            System.out.println(state);
        }
// проверка на наличие элемента в списке
        if (states.contains("Германия")) {
            System.out.println("Список содержит государство Германия");
        }
        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента
    }
}
