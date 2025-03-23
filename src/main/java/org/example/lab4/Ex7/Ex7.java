package org.example.lab4.Ex7;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] data_nastere = {12, 03, 2015};

        Copil copil = new Copil();
        copil.setName("Copil 1");
        copil.setBirthDate(data_nastere);

        System.out.println(copil.se_prezinta());
        System.out.println(copil.spune_varsta());
        System.out.println(copil.calculeaza_numere(3, 6));
        System.out.println(copil.calculeaza_numere(3, 100));
        System.out.println(copil.spune_alfabet("direct"));
        System.out.println(copil.spune_alfabet("invers"));
        System.out.println(copil.coloreaza_tabla_sah(3,3));
        System.out.println(copil.spune_la_revedere());


    }


}
