package org.example.lab9.ex2;

import java.util.List;
import java.util.Random;

//clasa care genereaza numerele random
class RNG implements Runnable {
    //lista unde tin numerele
    private final List<Integer> list;

    //consctructor cu parametru list
    public RNG(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //obiect random
        Random rnd = new Random();
        //generare si adaugare numere random in lista
        for (int i = 0; i < 30; i++) {
            int nr = rnd.nextInt(30);
            list.add(nr);
            System.out.printf("\nNumar generat: " +  nr);
        }
    }
}