package ru.mirea.Task13;

public class Task133<T> {
    private final int size = 16;
    private final int cut = 4;
    private Object[] array = new Object[size];
    private int pointer = 0;


    public void addT(T item) {
        if(pointer == array.length-1)
            resizeT(array.length*2);
        array[pointer++] = item;
    }


    public T getT(int index) {
        return (T) array[index];
    }

    public void removeT(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > size && pointer < array.length / cut)
            resizeT(array.length/2);
    }

    private void resizeT(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public int sizeT() {
        return pointer;
    }

}
