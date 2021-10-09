package ru.geekbrains.homeworks.lesson1.task3;

public class Circle implements Figure {

    private static final double Pi = 3.14;
    private static double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void draw() {

    }

    @Override
    public double findSquare() {
        return Pi * r * r;
    }
}
