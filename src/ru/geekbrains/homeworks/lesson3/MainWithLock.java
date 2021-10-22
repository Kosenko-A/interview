package ru.geekbrains.homeworks.lesson3;


public class MainWithLock {


    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                counter.increment();
                System.out.println(counter.getCount());
                super.run();
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                counter.increment();
                System.out.println(counter.getCount());
                super.run();
            }
        };

        thread1.start();
        thread2.start();

    }
}
