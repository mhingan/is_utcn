package org.example.lab4.ex1;

import java.util.Random;

public class Methods {

    //metoda pentru media aritmetica
    public int media_aritmetica(int... numbers) {
        //varaibila care stocheaza suma
        int sum = 0;

        //cu un for parcurg fiecare elemnt din numbers
        for (int number : numbers) {
            //fac cuma elementelor
            sum += number;
        }
        //returnez media aritmetica a elementelor
        return sum / numbers.length;
    }

    //metoda 2 din cerinta care returneaza un sir de double de n dimensiune
    public double[] tablou(int n){
        //fac un tablou numit tablou de dimeniunea n
        double[] tablou = new double[n];
        //declar un obiect din clasa random
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            //asignez o valoare random elementelor din tablou
            tablou[i] = random.nextDouble();
        }
        return tablou;
    }


    public static String convertire_char(char[] tab) {
        // declar var temp pt fiecare caracter convertit in string
        String cuvant_temp;

        // initializez variabila care va contine rezultatul final
        String cuvant_final = "";

        // parcurgem fiecare caracter din array-ul primit ca parametru
        for (int i = 0; i < tab.length; i++) {
            // conver caracterul curent la string
            cuvant_temp = String.valueOf(tab[i]);

            // concat string-ul convertit la rezultatul final
            cuvant_final += cuvant_temp;
        }

        // return rezultatul final in litere mari
        return cuvant_final.toUpperCase();
    }

}
