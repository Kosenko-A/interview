package ru.geekbrains.homeworks.lesson1.task3;

import ru.geekbrains.homeworks.lesson1.task3.Figure;

public class Triangle implements Figure {

    private static double h;
    private static double a;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void draw() {

    }

    @Override
    public double findSquare() {
        return 0.5 * a * h;
    }
}
