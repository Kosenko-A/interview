package ru.geekbrains.homeworks.lesson1;

import ru.geekbrains.homeworks.lesson1.task1.Person;
import ru.geekbrains.homeworks.lesson1.task3.Circle;
import ru.geekbrains.homeworks.lesson1.task3.Square;
import ru.geekbrains.homeworks.lesson1.task3.Triangle;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withFirstName("Ann")
                .withLastName("Smith")
                .withGender("female")
                .withCountry("USA")
                .withAge(19)
                .build();

        Circle circle = new Circle(5);
        System.out.println(circle.findSquare());

        Triangle triangle = new Triangle(8, 6.5);
        System.out.println(triangle.findSquare());

        Square square = new Square(5,7);
        System.out.println(square.findSquare());
    }
}
