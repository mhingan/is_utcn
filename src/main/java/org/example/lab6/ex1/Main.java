package org.example.lab6.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul de valori pe care doriti sa le cititi: ");
        int digits_nr = scanner.nextInt();

        double[] digits = new double[digits_nr];

        System.out.println("Introduceti numerele: ");
        for (int i = 0; i < digits_nr; i++) {
            digits[i] = scanner.nextDouble();
        }

        System.out.println("Numere adaugate cu succes: ");
        for (int i = 0; i < digits_nr; i++) {
            System.out.println(digits[i] );
        }


        //accesare element
        try{
            System.out.println("Introduceti indexul elementului pe care doriti sa il accesati: ");
            int index = scanner.nextInt();

            if(index < 0 || index > digits_nr){
                throw new WrongDigitsError("INDEX GRESIT - Incercati din nou");
            }

            System.out.println("Numarul asociat indexului " + index + " este: " + digits[index]);
        } catch (WrongDigitsError e){
            System.out.println(e.getMessage());
        }
    }
}
