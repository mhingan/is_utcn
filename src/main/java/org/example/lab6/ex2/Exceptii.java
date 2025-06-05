package org.example.lab6.ex2;

import java.util.Scanner;

public class Exceptii {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        arithmeticException();
        outOfBoundException();


    }

    public static void arithmeticException() {
        //arithmetic exception
        System.out.println("Introduceti numarul a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti numarul b: ");
        int b = scanner.nextInt();

        try {
            double c = (double) a / b;
            System.out.println("a/b = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Am prins sau nu exceptii");
        }
    }

    public static void outOfBoundException() {
        System.out.println("Introduceti numarul de valori: ");
        int a = scanner.nextInt();

        int[] digits = new int[a];

        System.out.println("Introduceti valorile: ");
        for (int i = 0; i < a; i++) {
            digits[i] = scanner.nextInt();
        }


        boolean indexValid = false;

        while (!indexValid) {
            try {

                System.out.println("Introduceti indexul cautat: ");
                int index = scanner.nextInt();

                boolean found = false;

                for (int i=0; i<digits.length; i++) {
                    if (digits[i] == index) {
                        System.out.println("Numarul asociat intexului cautat este: " + digits[i]);
                        found = true;
                        indexValid = true;
                        break;
                    }
                }
                if (!found) {
                    throw new ArrayIndexOutOfBoundsException("Indexul nu a fost gasit. Te rog sa incerci din nou.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
