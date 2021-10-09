package ru.geekbrains.homeworks.lesson1.task3;

import ru.geekbrains.homeworks.lesson1.task3.Figure;

public class Square implements Figure {

    private static double a;
    private static double b;

    public Square (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {

    }

    @Override
    public double findSquare() {
        return a * b;
    }
}
