package org.example.lab9.ex2;

import java.util.List;

class Aria implements Runnable {
    //creeez o lista de integers
    private final List<Integer> list;

    //constructor care are ca parametru lista de mai sus
    public Aria(List<Integer> list) {
        this.list = list;
    }

    //suprascrierere metoda run()
    @Override
    public void run() {
        //verific daca elementele sunt divizibile cu 3, daca sunt, le calzulez aria si le afisez
        for (int r : list) {
            if (r % 3 == 0) {
                System.out.printf("\nCalculat: r=" + r +  ", aria= " + aria(r));
            }
        }
    }

    //metoda care calculeaza aria
    public static double aria(int nr) {
        return Math.PI * nr * nr;
    }
}