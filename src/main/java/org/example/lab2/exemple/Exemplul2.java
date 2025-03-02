package org.example.lab2.exemple; // Pachetul în care se află clasa

import java.io.*; // Importă bibliotecile necesare pentru input/output
import java.lang.String; // Importă clasa String (nu este necesar, dar nu afectează codul)
import java.io.IOException; // Importă clasa IOException pentru gestionarea excepțiilor

public class Exemplul2 { // Declarăm clasa principală
    public static void main(String[] args) { // Metoda principală a programului

        // Creăm un flux de intrare pentru a citi date de la tastatură
        // DataInputStream dis  = new DataInputStream(System.in); // Această linie este comentată și neutilizată

        BufferedReader dis = new BufferedReader(new InputStreamReader(System.in)); // Creăm un obiect BufferedReader pentru a citi input de la tastatură

        String Syear = null; // Declarăm o variabilă pentru a stoca anul introdus de utilizator
        System.out.print("Enter a year: "); // Afișăm mesajul pentru utilizator
        System.out.flush(); // Asigurăm afișarea imediată a mesajului în consolă

        try {
            Syear = dis.readLine(); // Citim input-ul utilizatorului ca string
        } catch (IOException ioe) { // Gestionăm posibilele excepții legate de citire
            System.out.println(ioe.toString()); // Afișăm eroarea
            System.exit(1); // Terminăm programul în caz de eroare
        }

        long year = Long.parseLong(Syear); // Convertim string-ul citit într-un număr de tip long

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
