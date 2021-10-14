package ru.geekbrains.homeworks.lesson2;

public interface List<E> {

    void add(E value);

    E get(int index);

    void set(int index, E value);

    void remove(int index);

    int getSize();

}
