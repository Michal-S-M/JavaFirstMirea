package ru.mirea.Task12;

public class Task12 {
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].getID() > temp.getID()) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for (int i = 0; i < 10; i++) {
            IDNumber[i] = new Student((int)(Math.random()*100), i);
            System.out.println("студент ["+i+"] - "+IDNumber[i].getID());
        }
        System.out.println("\nОтсортированный массив:");
        insertionSort(IDNumber);
        for (Student student:IDNumber) {
            System.out.println(student);
        }
    }
}