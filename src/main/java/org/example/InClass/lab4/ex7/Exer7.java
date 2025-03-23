package org.example.InClass.lab4.ex7;

public class Exer7 {
    public static void main(String[] args) {

        int[] data_nastere = {12, 03, 2015};

        Copil copil = new Copil();

        copil.setName("Copil 1");
        copil.setBirthDate(data_nastere);

        System.out.println(copil.sePrezinta());
        System.out.println(copil.spuneVarsta());
        System.out.println(copil.adunaNumere(3, 6));
        System.out.println(copil.adunaNumere(3, 100));
        System.out.println(copil.spuneAlfabet("direct"));
        System.out.println(copil.spuneAlfabet("invers"));
        System.out.println(copil.coloreazaTablaSah(3,3));
        System.out.println(copil.spuneLaRevedere());


    }

}
