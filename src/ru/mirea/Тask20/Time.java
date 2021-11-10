package ru.mirea.Тask20;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        calendar.set(Calendar.YEAR, 2021);
        System.out.println("введите требуемый месяц: ");
        int d = in.nextInt();
        calendar.set(Calendar.MONTH, d);
        System.out.println("введите требуемый день: ");
        d = in.nextInt();
        calendar.set(Calendar.DAY_OF_MONTH, d);
        System.out.println("введите требуемый час: ");
        d = in.nextInt();
        calendar.set(Calendar.HOUR_OF_DAY, d);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        if(date1.after(date)) System.out.println("на эту дату записаться нельзя");
        else System.out.println("запись оформлена на "+formatter.format(date));
    }
}
