package org.example.lab3;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        System.out.println("Introduceti un string: ");

        Scanner scanner = new Scanner(System.in);
        String value_insert = scanner.nextLine();

        System.out.println("Introduceti caracterul pe care doriti sa il cautati in string: ");
        char caracter_search = scanner.nextLine().charAt(0);

        int nr_aparitie = searchCharacter(value_insert, caracter_search);

        if (nr_aparitie == 0) {
            System.out.println("Caracterul pe care doriti sa il cautati in stringul curent nu exista.");
        } else {
            System.out.println("Caracterul \"" + caracter_search + "\" apare de " + nr_aparitie + " ori in Stringul \" " + value_insert + ".");
        }
    }

    public static int searchCharacter(String tab, char a) {

        int counter = 0;

        for (int i = 0; i < tab.length(); i++) {
            if (a == tab.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}


/**
 * /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58545:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab3.Problema2
 * Introduceti un string:
 * Mihaita are cele mai bune mere din lumea acesta
 * Introduceti caracterul pe care doriti sa il cautati in string:
 * a
 * Caracterul "a" apare de 7 ori in Stringul " Mihaita are cele mai bune mere din lumea acesta.
 *
 * Process finished with exit code 0
 * */