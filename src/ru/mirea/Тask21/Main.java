package ru.mirea.Тask21;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Facilities> facilites = new ArrayList<>();
        List<Vaccines> vaccines = new ArrayList<>();
        boolean flag = true;
        boolean flag1 = true;
        int i=0;
       while (flag){
           i++;
           Vaccines vac = new Vaccines((int)(Math.random()*10000));
           Random random = new Random();
           String type = random.ints(97, 123)
                    .limit(5)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
           vac.changeType((String)type);
           vac.changePrice((int)(Math.random()*100));
           vac.changeQuantity((int)(Math.random()*100));
           vaccines.add(vac);
           System.out.println("добавть ещё одну вакцину?");
           Scanner in = new Scanner(System.in);
           flag = in.nextBoolean();
        }
        while (flag1){
            Facilities f = new Facilities((int)(Math.random()*10000));
            Random random = new Random();
            String type = random.ints(97, 123)
                    .limit(5)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            f.changeType(type);
            facilites.add(f);
            f.changePrice((int)(Math.random()*100));
            Scanner in = new Scanner(System.in);
            System.out.println("добавть ещё одно оборудование?");
            flag1 = in.nextBoolean();
        }
        for(Vaccines v : vaccines){
            System.out.println(v);
        }
        System.out.println("\n");
        for(Facilities f : facilites){
            System.out.println(f);
        }
    }
}
