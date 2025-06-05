package org.example.lab9.ex3;


import java.util.List;

public class Fibonacci {

    // Produce primii n termeni Fibonacci si ii adauga in lista
    public static void generare(int n, List<Integer> list) {
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            int value;             // vom stoca aici termenul curent
            // pentru pasul 0, valoarea este intotdeauna 0
            if (i == 0) {
                value = 0;
            }
            // pentru pasul 1, valoarea este intotdeauna 1
            else if (i == 1) {
                value = 1;
            }
            // pentru pasul 2 si mai departe, valoarea este suma celor doi termeni anteriori
            else {
                value = a + b;
            }
            // daca suntem la pasul 2 sau mai sus, actualizam a si b pentru urmatoarea iteratie
            if (i >= 2) {
                int c = a + b;  // calculeaza urmatorul termen
                a = b;          // muta vechiul termen b in a
                b = c;          // b devine noul termen calculat
            }
            // adauga in lista termenul obtinut
            list.add(value);
        }
    }


    // Asteapta si afiseaza pe rand fiecare element din lista
    public static void afisare(int n, List<Integer> list) {
        int printed = 0;                     // contor pentru cate elemente am afisat deja

        // repetam pana cand am afisat elementul n
        while (printed <= n) {
            // sincronizam accesul la lista pentru a evita erori de concurenta
            synchronized (list) {
                // cat timp exista elemente noi neafisate in lista
                while (printed < list.size()) {
                    // afisam Fibonacci(printed) = valoarea corespunzatoare
                    System.out.printf("\nFibonacci(" +  printed +")" + " = " + list.get(printed));
                    printed++;               // trecem la urmatorul element
                }
            }

        }
    }


}
