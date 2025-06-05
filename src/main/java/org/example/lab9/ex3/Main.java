package org.example.lab9.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.example.lab9.ex3.Fibonacci.afisare;
import static org.example.lab9.ex3.Fibonacci.generare;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Afisam un mesaj pentru user si citim de la tastatura valoarea n
        System.out.println("Introduceti nr. pana la care doriti sa afisati sirul: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // citim n

        // cream o lista sincronizata undeadaugam si citim
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // Cream firul de productie care va rula metoda generare(n, list) la start
        // () -> generare(n, list) este o expresie lambda care implementeaza metoda run() din Runnable
        // echivalent cu:
        // new Runnable() {
        //    @Override
        //    public void run() {
        //       generare(n, list);
        //    }
        // }
        Thread producer = new Thread(() -> generare(n, list), // lambda: corpul metodei run()
                "Calculator"             // numele thread-ului, pentru debugging
        );

        // Cream firul de consum care va apela metoda afisare(n, list)
        // lambda implementeaza tot Runnable.run()
        Thread consumer = new Thread(() -> afisare(n, list), // lambda: corpul metodei run()
                "Afisare"               // numele thread-ului
        );


        // pornim intai firul de afisare – va intra in polling pana apar date
        consumer.start();
        // apoi pornim firul de calcul – acesta va incepe sa umple lista cu valori
        producer.start();

        // asteptam sa termine calculul
        producer.join();
        // apoi asteptam sa termine si afisarea
        consumer.join();
    }

}
