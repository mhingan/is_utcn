package org.example.lab2;

//4. Scrieți o aplicație Java în care citiți de la tastatura mai multe numere întregi și verificati dacă sunt numere
//prime. Numărul de valori citite este preluat de la tastatura sau din linia de comanda.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul d evalori pe care doriti sa le citi: ");

        int nr = scanner.nextInt();

        int[] numere = new int[nr];

        System.out.println("Introduceti valorile rand pe rand, cu un enter dupa fiecare: ");

        for (int i = 0; i < nr; i++) {
            numere[i] = scanner.nextInt();
        }

        verificare(numere);


    }


    public static void verificare(int[] numere) {
        //parcurg fiecare element din array
        for (int i = 0; i < numere.length; i++) {
            //numar divizorii numarului
            int numar_divizori = 0;

            for (int j = 1; j < numere[i]; j++) {//verific divizorii numarului curent
                if (numere[i] % j == 0) {
                    numar_divizori++; //cresc nr div daca este cazul
                }
            }

            if (numar_divizori <= 2) {
                System.out.println("Numarul " + numere[i] + " este numar prim.");
            } else {
                System.out.println("Numarul " + numere[i] + " nu este numar prim.");
            }

        }
    }
}


/** OUTPUT
 /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=52953:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab2.Ex4
 Introduceti numarul d evalori pe care doriti sa le citi:
 3
 Introduceti valorile rand pe rand, cu un enter dupa fiecare:
 1
 3
 16
 Numarul 1 este numar prim.
 Numarul 3 este numar prim.
 Numarul 16 nu este numar prim.

 Process finished with exit code 0
 * **/
