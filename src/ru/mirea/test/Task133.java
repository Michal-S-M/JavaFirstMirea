package ru.mirea.test;

public class Task133<T> {
    private final int size = 16;
    private final int cut = 4;
    private Object[] array = new Object[size];
    private int pointer = 0;


    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }


    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > size && pointer < array.length / cut)
            resize(array.length/2);
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public int size() {
        return pointer;
    }
}
