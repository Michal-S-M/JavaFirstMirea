package ru.mirea.Тask29;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.*;
public class Main implements Serializable {
    private static final long serialV= 1L;
    private int heals,stamina, money;
    private String hero_name;
    public Main(int heals, int stamina, int money, String hero_name){
        this.heals=heals;
        this.money=money;
        this.stamina=stamina;
        this.hero_name=hero_name;
    }
    private void setHeals(int heals){
        this.heals=heals;
    }
    private void setMoney(int money){
        this.money=money;
    }
    private void setStamina(int stamina){
        this.stamina=stamina;
    }
    private void setHero_name(String hero_name){
        this.hero_name=hero_name;
    }

    private int getHeals(){
        return heals;
    }
    private int getMoney(){
        return money;
    }
    private int getStamina(){
        return stamina;
    }
    private String getHero_name(){
        return hero_name;
    }

    @Override
    public String toString(){
        return "CurrencyInfo{"+" heals = "+heals+" money = "+money
                +" stamina = " + stamina + " hero_name = " + hero_name+"}";

    }
    public static void main(String[] args) {
        int heals = 100, stamina = 200, money = 50;
        String hero_name = "Saitama";

        Main savedGame = new Main(heals, stamina, money, hero_name);

        try {
            FileOutputStream outputStream = new FileOutputStream("C:/Users/admin/Desktop/save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(savedGame);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("поймано исключение: " + e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("C:/Users/admin/Desktop/save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(savedGame);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
