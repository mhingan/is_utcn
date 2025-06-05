package org.example.lab6.ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumarInmatriculare nr = new NumarInmatriculare();
        VerificareNumarInmatriculare ver = new VerificareNumarInmatriculare();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti literele corespunzatoare judetului: ");
        String judet = scanner.next();

        System.out.println("Introduceti literele corespunzatoare numar: ");
        int numar = scanner.nextInt();

        System.out.println("Introduceti literele corespunzatoare stringului: ");
        String valAlfabetica = scanner.next();

        nr.setJudet(judet);
        nr.setNumar(numar);
        nr.setValAlfabatica(valAlfabetica);


        System.out.println(nr);

    }
}
