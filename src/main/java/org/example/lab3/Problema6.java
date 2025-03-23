package org.example.lab3;

//6. Scrieți un program Java care genereaza 2 valori aleatoare și efectuează asupra lor câteva operații
//matematice.

import java.util.Random;

public class Problema6 {
    public static void main(String[] args) {
        Random rand1 = new Random();

        int nr1 = rand1.nextInt(100);
        int nr2 = rand1.nextInt(100);

        System.out.println("Nr generate random: " + nr1 + "," + nr2);

        int adunare = nr1 + nr2;
        System.out.println("Adunare: " + adunare);

        int scadere = nr1 - nr2;
        System.out.println("Scadere: " + scadere);


    }

}


/**
 * /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58582:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab3.Problema6
 * Nr generate random: 86,34
 * Adunare: 120
 * Scadere: 52
 *
 * Process finished with exit code 0
 * */