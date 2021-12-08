package ru.mirea.Тask26;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int str;
        System.out.println("введите требуемый тип услуг:\n1. запись на приём\n 2. покупка товара в аптеке\n 3. амбулаторное лечение\n4. покупка справки\n");
        str=sc.nextInt();
        switch (str) {
            case 1 -> {
            reception r = new reception();
            r.pay();
            }
            case 2 -> {
            product p = new product();
            p.pay();
            }
            case 3 -> {
            outpatient o = new outpatient();
            o.pay();
            }
            case 4 -> {
            certificate c = new certificate();
            c.pay();
            }
        }
    }
}
