package ru.geekbrains.homeworks.lesson3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainWithLock {


    public static void main(String[] args) {

        Counter counter = new Counter();
        try {
            counter.increment();
            System.out.println(counter.getCount());
        } finally {
            System.out.println("___");
        }

        Lock lock2 = new ReentrantLock();
        lock2.lock();
        try {
            counter.increment();
            System.out.println(counter.getCount());
        } finally {
            System.out.println("___");
        }

    }
}
