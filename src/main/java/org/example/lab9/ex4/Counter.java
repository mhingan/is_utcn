package org.example.lab9.ex4;

// Clasa care tine un contor comun
public class Counter {
    private int count = 0;

    // metoda sincronizata: doar un fir poate intra aici o data
    public synchronized void increment() {
        count++;
    }

    // metoda sincronizata: tot aici avem excludere mutua
    public synchronized void decrement() {
        count--;
    }

    // intoarce valoarea curenta a contorului
    public int getCount() {
        return count;
    }
}
