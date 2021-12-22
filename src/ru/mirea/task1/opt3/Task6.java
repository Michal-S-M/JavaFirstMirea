package ru.mirea.task1.opt3;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        double a;
        int x;
        for (int i = 0; i < 10; i++) {
            a = Math.random() * 100;
            arr[i] = (int) a;
            System.out.println(i + "-ый эллемент массива: " + arr[i]);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = x;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "-ый эллемент массива: " + arr[i]);
        }
    }
}

