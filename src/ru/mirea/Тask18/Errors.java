package ru.mirea.Тask18;
import java.util.Scanner;

enum Doctor {
    ENT(400), dental(350), СardiacSurgeon(450), Ophthalmologist(300);
    private int price;
    Doctor(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}

public class Errors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите требуемого врача: ");
        String d = in.nextLine();
        try {
            Doctor ap = Doctor.valueOf(d);
            System.out.print("это будет стоить: " + ap.getPrice());
        } catch (IllegalArgumentException e){
            System.out.print("данного врача нет в каталоге");
        }
    }
}
