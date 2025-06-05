package org.example.lab5.ex3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sfera sfera = new Sfera();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu raza sferei: ");
        sfera.setRaza(scanner.nextInt());

        Cub cub = new Cub();
        System.out.println("Introdu lungimea laturii cubului: ");
        cub.setLatura(scanner.nextInt());

        Cilindru cilindru = new Cilindru();
        System.out.println("Introdu inaltimea cilindrului: ");
        cilindru.setInaltime(scanner.nextInt());
        System.out.println("Introdu raza bazei cilindrului: ");
        cilindru.setRaza_basei(scanner.nextInt());

        Vopsitorie vopsitorie = new Vopsitorie();
        double cantitateVopseaSfera = vopsitorie.calculeazaCantitateVopsea(sfera);
        double cantitateVopseaCub = vopsitorie.calculeazaCantitateVopsea(cub);
        double cantitateVopseaCilindru = vopsitorie.calculeazaCantitateVopsea(cilindru);

        System.out.println("Cantitate necesara pentru sfera: " + cantitateVopseaSfera + " litri.");
        System.out.println("Cantitate necesara pentru sub: " + cantitateVopseaCub + " litri.");
        System.out.println("Cantitate necesara pentru cilindru: " + cantitateVopseaCilindru + " litri.");

    }
}
