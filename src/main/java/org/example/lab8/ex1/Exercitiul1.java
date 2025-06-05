package org.example.lab8.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitiul1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //citesc linia de la tastatura
        String string = reader.readLine();

        //despart dupa spatii
        String[] words = string.split(" ");

        int zi = 0;
        int an = 0;

        try{
            zi = Integer.parseInt(words[0]);
        } catch (Exception e){
            System.out.println("Eroare ZI: " + e.getMessage());
        }

        String luna = words[1];

        try{
            an = Integer.parseInt(words[2]);
        } catch (Exception e){
            System.out.println("Eroare AN: " + e.getMessage());
        }

        System.out.println(zi);
        System.out.println(luna);
        System.out.println(an);



    }
}
