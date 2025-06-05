package org.example.lab6.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Class2 class2 = new Class2(2.3, 4.5);

        System.out.println("Introduceti valorile pentru a si b");
        Scanner scanner = new Scanner(System.in);

        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();


        int a = class2.suma(val1, val2);
        double b = class2.produs(val1, val2);

        System.out.println("a: " + a + ", b: " + b);
    }
}
