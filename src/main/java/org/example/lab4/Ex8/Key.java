package org.example.lab4.Ex8;

import java.util.Scanner;

public class Key {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cheia: ");
        String cheia = scanner.nextLine();

        System.out.println(VerificareToken.verificare(cheia));

    }
}
