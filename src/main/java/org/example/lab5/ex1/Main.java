package org.example.lab5.ex1;

public class Main {
    public static void main(String[] args) {
        //instantiere clasa ImplementareOperatii
        ImplementareOperatii implementareOperatii = new ImplementareOperatii();
        System.out.println("Adunare: " + implementareOperatii.adunare(2, 3));
        System.out.println("Impartire: " + implementareOperatii.impartire(1, 2));
        System.out.println("Inmultire: " + implementareOperatii.inmultire(5, 4));
        System.out.println("Radical: " + implementareOperatii.radical(2, 3));
        System.out.println("Scadere: " + implementareOperatii.scadere(1, 0));
        System.out.println("Ridicare la putere: " + implementareOperatii.ridicareLaPutere(9, 0));

    }
}
