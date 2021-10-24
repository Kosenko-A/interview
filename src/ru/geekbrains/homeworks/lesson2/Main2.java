package ru.geekbrains.homeworks.lesson2;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        //ArrayList
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.getSize());

        //LinkedList
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.getSize());
    }
}
