package org.example;

import org.example.model.CustomThread;

public class Main {


    public static void main(String[] args) {
//        System.out.println("Hello world!");

        CustomThread customThread = new CustomThread();

        Thread t1 = new Thread(customThread, "t1");
        Thread t2 = new Thread(customThread, "t2");
        Thread t3 = new Thread(customThread, "t3");
        Thread t4 = new Thread(customThread, "t4");
        Thread t5 = new Thread(customThread, "t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}