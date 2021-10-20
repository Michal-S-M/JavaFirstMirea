package ru.mirea.test;
import java.util.Scanner;

import java.io.*;
public class Task15 {
    public static void main(String[] args) {

        //1
        try (FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\javatest.txt", false)) {
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(text);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //2
        try (FileReader reader = new FileReader("C:\\Users\\admin\\Desktop\\javatest.txt")) {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.print("\n");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //3
        try (FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\javatest.txt", true)) {
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(text);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //4
        try (FileReader reader = new FileReader("C:\\Users\\admin\\Desktop\\javatest.txt")) {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}