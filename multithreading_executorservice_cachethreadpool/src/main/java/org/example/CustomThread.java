package org.example;

public class CustomThread implements Runnable{
    private int number = 0;
    private int primeNumberCal = 2;

    public CustomThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int primeNumber = 0;
        if (number == 1) {
            System.out.println(number + " prime number is: " + primeNumberCal);
            return;
        }

        for (int i = 2; primeNumber < number; i++) {
            if (primeNum(i)) {
                primeNumber++;
                primeNumberCal = i;
            }
        }
        System.out.println(number + " prime number is: " + primeNumberCal);
    }

    private boolean primeNum(int num){

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
