package ru.geekbrains.homeworks.lesson3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private Lock lock = new ReentrantLock();
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public int increment() {
        lock.lock();
        int newCount = ++count;
        lock.unlock();
        return newCount;
    }
}
