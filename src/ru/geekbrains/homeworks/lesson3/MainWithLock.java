package ru.geekbrains.homeworks.lesson3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainWithLock {

    private static int num1 = 0;

    public static void main(String[] args) {

        Lock lock1 = new ReentrantLock();
        lock1.lock();
        try {
            num1++;
            System.out.println(num1);
        } finally {
            lock1.unlock();
        }

        Lock lock2 = new ReentrantLock();
        lock2.lock();
        try {
            num1++;
            System.out.println(num1);
        } finally {
            lock2.unlock();
        }

    }
}
