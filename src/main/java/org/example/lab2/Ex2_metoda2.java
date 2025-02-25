package org.example.lab2;

import java.util.Scanner;

//2. Scrieți o aplicație Java în care se citesc de la tastatura 2 valori întregi și se afișează cel mai mare divizor
//comun al numerelor.

//metoda 2, int a sub forma de array

public class Ex2_metoda2 {

    //declarare variabila dis, din clasa Scanner, pe care o folosesc pt a citit de la tastatura
    private static Scanner scanner;

    public static void main(String[] args) {
        //instantiere obiect din clasa Scanner (care are ca parametru System.in pentru a citi de la tastatura
        scanner = new Scanner(System.in);

        //variabila unde stochez valoarea cititia de la tastatura
        int[] numere = new int[2];

        System.out.println("Introduceti 2 valori int: ");

        for (int i = 0; i < numere.length; i++) {
            numere[i] = scanner.nextInt();
        }

        int cmmdc = cmmd(numere);

        System.out.println("Cmmdc pentru numerele " + numere[0] + " si " + numere[1] + " este " + cmmdc);

    }

    //functie care determina cmmdc
    public static int cmmd(int[] numere) {

        //verific daca b este diferit de zero
        while (numere[1] != 0) {
            //restul impartirii a si b
            int rest = numere[0] % numere[1];
            //mut b in locul lui a
            numere[0] = numere[1];
            //mut restul in locul lui b
            numere[1] = rest;
        }

        //cand b este 0, a este cmmdc
        return numere[0];
    }
}


/**OUTPUT
 /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63435:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab2.Ex2
 Introduceti 2 valori int:
 120
 160
 CMMD al numerelor 120 si 160 este 40

 Process finished with exit code 0
 * */

