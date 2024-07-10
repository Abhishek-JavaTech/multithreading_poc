package org.example.model;

public class CustomThread implements Runnable{

    Integer count = 0;

    private void incre() {
        count++;
    }

    private void descr() {
        count--;
    }

    private void calc(){
        synchronized (this) {
            incre();
            System.out.println("Thread: " + Thread.currentThread().getName() + " count: " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            descr();
            System.out.println("Thread: " + Thread.currentThread().getName() + " count: " + count);
        }
    }

    @Override
    public void run() {
        calc();
    }
}
