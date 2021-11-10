package ru.mirea.Тask19;
import java.util.Scanner;

class Examples {
    static String Week(int num) throws Exception {
        String[] week = new String[] {"", "понедельник","вторник","среду","четверг","пятницу","субботу","воскресенье"};
        if ((num < 1)||(num > 7)) throw new Exception("невозможно оформить запись на данный день\n");
        return ("запись оформлена на "+week[num]);
    }

    public static void main(String[] args) {
        try {
            System.out.println("на какой день оформить запись?");
            Scanner in = new Scanner(System.in);
            int d = in.nextInt();
            Week(d);
            System.out.println(Week(d));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
