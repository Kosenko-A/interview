package ru.geekbrains.homeworks.lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> implements List<E> {

    private int INIT_SIZE = 16;
    private int CUT_RATE = 4;
    Object [] array = new Object[INIT_SIZE];
    private int pointer = 0;

    @Override
    public void add(E value) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = value;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void set(int index, E value) {
        if (index <= array.length) {
            array[index] = value;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }

    @Override
    public int getSize() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public String toString() {
        ArrayList<E> arrayList = new ArrayList<>();
        for (int i = 0; i < pointer; i++) {
            arrayList.add((E) array[i]);
        }
        return arrayList.toString();
    }
}
