package org.example.lab2.exemple; // Pachetul în care se află clasa

public class Exemplul5 { // Declarăm clasa principală

    public static void main(String[] args) { // Metoda principală a programului
        double x, y, z; // Declarăm variabile de tip double pentru calcule matematice
        int i; // Declarăm o variabilă întreagă

        i = 10; // Inițializăm variabila `i` cu valoarea 10

        y = Math.log(10.0); // Calculăm logaritmul natural al lui 10 (ln 10)

        x = Math.pow(3.0, 4.0); // Calculăm 3 la puterea 4 (3^4)

        z = Math.random(); // Generăm un număr aleatoriu între 0 și 1

        System.out.println("Value of i is " + i); // Afișăm valoarea variabilei `i`
        System.out.println("Value of log(10) is " + y); // Afișăm rezultatul logaritmului lui 10
        System.out.println("Value of 3 at power 4 is " + x); // Afișăm rezultatul 3^4
        System.out.println("A random number is " + z); // Afișăm numărul aleatoriu generat

        // Afișăm rădăcina pătrată a lui 2
        System.out.println("Square root of 2 is " + Math.sqrt(2));
    }
}
