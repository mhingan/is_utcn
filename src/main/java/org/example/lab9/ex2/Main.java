package org.example.lab9.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //lista de intregi
        List<Integer> list = new ArrayList<>();

        //pornesc thread-ul care genereaza numerele
        Thread generator = new Thread(new RNG(list), "Generator");
        generator.start();
        // astept sa se termine inainte de a continua
        generator.join();

        //dupa ce sunt cenerate toate nr, pornesc al doilea thread, care calculeaza aria
        Thread calculator = new Thread(new Aria(list), "Calculator");
        calculator.start();
        calculator.join();
    }
}
