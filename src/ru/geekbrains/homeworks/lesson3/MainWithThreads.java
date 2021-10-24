package ru.geekbrains.homeworks.lesson3;

public class MainWithThreads {

    private static final String str1 = "ping";
    private static final String str2 = "pong";

    public static void main(String[] args) {

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (str1) {
                    super.run();
                    System.out.println(str1);
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (str2) {
                    super.run();
                    System.out.println(str2);
                }
            }
        };

        thread1.start();
        thread2.start();

    }


}
