package ru.mirea.task6;

public class Main {
    public static void main(String[] args) {
    Planet p1 = new Planet("Venus");
    Planet p2 = new Planet("Earth");
    Planet p3 = new Planet("Mars");

    Beast b1 = new Beast("Bear");
    Beast b2 = new Beast("Wolf");
    Beast b3 = new Beast("Cat");

    System.out.println(p1.getName());
    System.out.println(p2.getName());
    System.out.println(p3.getName());
    System.out.println(b1.getName());
    System.out.println(b2.getName());
    System.out.println(b3.getName());
    }
}
