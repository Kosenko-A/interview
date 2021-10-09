package ru.geekbrains.homeworks.lesson1.task2;

public class Lorry extends Car implements Moveable, Stopable { //интерфейсы имплементируются

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }

    //добавлен метод open(), так как наследуется от класса Car
    @Override
    void open() {
        System.out.println("Car is open");
    }
}
