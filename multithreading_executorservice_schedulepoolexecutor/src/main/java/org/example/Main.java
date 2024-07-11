package org.example;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);

        System.out.println("Enter a number to find a prime number of OR press 0 to exit! ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("closing program");
                executorService.shutdown();
                break;
            } else {
                Thread t = new Thread(new CustomThread(number));
                t.setDaemon(true);// if we enter 0 then our whole program will close
//                executorService.execute(t);
                executorService.scheduleAtFixedRate(t, 1000, 100, TimeUnit.MICROSECONDS);

            }
        }
    }
}