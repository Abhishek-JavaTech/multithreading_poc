package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number to find a prime number of OR press 0 to exit! ");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("closing program");
                return;
            } else {
                Thread t = new Thread(new CustomThread(number));
                t.setDaemon(true);// if we enter 0 then our whole program will close
                t.start();
            }
        }
    }
}