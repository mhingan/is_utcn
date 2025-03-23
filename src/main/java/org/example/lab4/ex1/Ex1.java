package org.example.lab4.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Methods methods = new Methods();
        float media_ar = methods.media_aritmetica(1,2,3,4,5,6,7,8,9);

        System.out.println("Media aritmetica: " + media_ar);

        Scanner scanner = new Scanner(System.in);
        System.out.println("->Introdu un numar de elemnete pe care le vrei generate aleator: ");
        int number = scanner.nextInt();

        System.out.println("Elementele generate aleator sunt: " + Arrays.toString(methods.tablou(number)));

        char[] caracter = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println(Methods.convertire_char(caracter));

    }
}
