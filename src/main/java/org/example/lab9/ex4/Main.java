package org.example.lab9.ex4;

// Clasa principala in care pornim firele de executie
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // fir care face 1000 de incrementari
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }, "Incrementeaza-1");

        // fir care face 1000 de decrementari
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.decrement();
                }
            }
        }, "Decrementeaza");

        // alt fir care face iar 1000 de incrementari
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }, "Incrementeaza-2");

        // pornim toate firele
        t1.start();
        t2.start();
        t3.start();

        // asteptam sa termine toate
        t1.join();
        t2.join();
        t3.join();

        // rezultatul asteptat este 1000 (2000 incrementari minus 1000 decrementari)
        System.out.println("Rezultat cu metode sincronizate: " + counter.getCount());
    }
}

