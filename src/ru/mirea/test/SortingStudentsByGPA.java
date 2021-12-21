package ru.mirea.test;
/*
public class SortingStudentsByGPA implements Comparator {
    boolean flag;
    SortingStudentsByGPA(){
        flag=true;
    }
    public void quickSort(Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2].getMark();
        do {
            while (source[leftMarker].getMark() < pivot) {
                leftMarker++;
            }
            while (source[rightMarker].getMark() > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}
*/