package org.example.lab2.exemple; // Pachetul în care se află clasa

import java.io.Console; // Importăm clasa Console pentru citirea input-ului de la tastatură

public class Exemplul4 { // Declarăm clasa principală
    public static void main(String args[]) { // Metoda principală a programului

        //DataInputStream dis = new DataInputStream(System.in); // Linia comentată (nefolosită)

        Console dis = System.console(); // Inițializăm obiectul Console pentru a citi input-ul utilizatorului

        String Syear = null; // Variabilă pentru a stoca anul introdus sub formă de string

        System.out.print("Enter a year: "); // Afișăm mesajul pentru utilizator
        System.out.flush(); // Asigurăm afișarea imediată a mesajului în consolă

        Syear = dis.readLine(); // Citim input-ul utilizatorului ca string
        long year = Long.parseLong(Syear); // Convertim string-ul citit într-un număr de tip long

        System.out.println("year is " + year); // Afișăm anul introdus de utilizator

        // Verificăm dacă anul este bisect:
        // - Un an este bisect dacă este divizibil cu 4 și NU este divizibil cu 100,
        //   SAU dacă este divizibil cu 400.
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " is a leap year!"); // Afișăm mesajul dacă anul este bisect
        else
            System.out.println(year + " is NOT a leap year."); // Afișăm mesajul dacă anul NU este bisect
    }
}
