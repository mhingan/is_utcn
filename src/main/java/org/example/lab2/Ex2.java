package org.example.lab2;

import java.util.Scanner;

//2. Scrieți o aplicație Java în care se citesc de la tastatura 2 valori întregi și se afișează cel mai mare divizor
//comun al numerelor.
public class Ex2 {

    //declarare variabila dis, din clasa Scanner, pe care o folosesc pt a citit de la tastatura
    private static Scanner scanner;

    public static void main(String[] args) {
        //instantiere obiect din clasa Scanner (care are ca parametru System.in pentru a citi de la tastatura
        scanner = new Scanner(System.in);

        //variabila unde stochez valoarea cititia de la tastatura
        int a, b;

        System.out.println("Introduceti 2 valori int: ");

        //citesc a-ul si b-ul de la tastatura
        a = scanner.nextInt();
        b = scanner.nextInt();

        int cmm = cmmd(a, b);

        System.out.println("CMMD al numerelor " + a + " si " + b + " este " + cmm);


    }

    //functie care determina cmmdc
    public static int cmmd(int a, int b) {

        //verific daca b este diferit de zero
        while (b != 0) {
            //restul impartirii a si b
            int rest = a % b;
            //mut b in locul lui a
            a = b;
            //mut restul in locul lui b
            b = rest;
        }

        //cand b este 0, a este cmmdc
        return a;
    }
}


/**OUTPUT
 * /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63157:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab2.Ex2
 *
 *  Introduceti 2 valori int:
 * 12
 * 16
 * CMMD al numerelor 12 si 16 este 4
 *
 * Process finished with exit code 0
 * */

