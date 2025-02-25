package org.example.lab2;

import java.util.Scanner;

//1. Scrieți o aplicație Java în care citiți de la tastatura o valoare întreagă și se afișează factorialul numărului
//citit.
public class Ex1 {

    //declarare variabila dis, din clasa Scanner, pe care o folosesc pt a citit de la tastatura
    private static Scanner scanner;

    public static void main(String[] args) {
        //instantiere obiect din clasa Scanner (care are ca parametru System.in pentru a citi de la tastatura
        scanner = new Scanner(System.in);

        //variabila unde stochez valoarea cititia de la tastatura
        int n;

        System.out.println("Introduceti un numar: ");

        //citesc n-ul de la tastatura
        n = scanner.nextInt();

        //declarare int care este egal cu factorialul lui n
        int factorial_n = factorial(n);

        System.out.println("Factorialul numarului " + n + " este " + factorial_n);

    }

    public static int factorial(int n) {
        //daca n este ==1, factorialul o sa fie 1
        if(n==1){
            return 1;
        } else {
            //daca n este diferit de 1, factorialul o
            return n*factorial(n-1);
        }
    }
}



/** OUTPUT:
 * /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=61498:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab2.Ex2
 * Introduceti un numar:
 * 10
 * Factorialul numarului 10 este 3628800
 *
 * Process finished with exit code 0
 * */
