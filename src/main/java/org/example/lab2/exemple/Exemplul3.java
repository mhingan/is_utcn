package org.example.lab2.exemple; // Pachetul în care se află clasa

import java.io.InputStream; // Importă clasa InputStream (deși nu este folosită direct)
import java.util.Scanner; // Importă clasa Scanner pentru citirea input-ului de la tastatură

public class Exemplul3 { // Declarăm clasa principală

    private static Scanner dis; // Declaram un obiect Scanner ca variabilă de clasă

    public static void main(String args[]) { // Metoda principală a programului

        dis = new Scanner(System.in); // Inițializăm Scanner pentru a citi input de la tastatură

        long year; // Declarăm variabila pentru a stoca anul introdus

        System.out.print("Enter a year: "); // Afișăm mesajul pentru utilizator
        System.out.flush(); // Asigurăm afișarea imediată a mesajului în consolă

        year = dis.nextLong(); // Citim input-ul utilizatorului ca un număr de tip long
        System.out.println("year is " + year); // Afișăm anul introdus de utilizator

        // Verificăm dacă anul este bisect:
        // - Un an este bisect dacă este divizibil cu 4 și NU este divizibil cu 100,
        //   SAU dacă este divizibil cu 400.

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " is a leap year!"); // Afișăm mesajul dacă anul este bisect
        else
            System.out.println(year + " is NOT a leap year. "); // Afișăm mesajul dacă anul NU este bisect
    }
}
