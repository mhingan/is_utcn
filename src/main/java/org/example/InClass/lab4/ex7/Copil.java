package org.example.InClass.lab4.ex7;

import java.util.Arrays;
import java.util.Random;

public class Copil {
    private String name;
    private int[] birthDate;

    public Copil(String name, int[] birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Copil(){}

    //copilul știe să se prezinte: „Salut, numele meu este ...”,
    public String sePrezinta() {
        return "Salut, numele meu este " + name;
    }


    public String spuneVarsta() {
        int an = 2025;
        int luna = 3;

        int an_copil = birthDate[0];
        int luna_copil = birthDate[1];

        if (an_copil > an || an_copil < 1900) {
            return "Anul nasterii este gresit";
        }
        if (luna_copil > 12 || luna_copil < 0) {
            return "Luna nasterii este gresita";
        }

        int an_final = an - an_copil;
        ;
        int luna_final = luna - luna_copil;

        return "Am varsta de " + an_final + " ani si " + luna_final + " luni.";
    }

    public String adunaNumere(int a, int b) {
        if (a > 10 || b > 10) {
            return "Nu pot aduna numere mai mari dde 10.";
        }
        if (a < 0 || b < 0) {
            return "Nu pot aduna numere mai mici dde 0.";
        }
        int suma = a + b;
        return "Suma numerelor " + a + " + " + b + " este " + suma + ".";
    }

    public String spuneAlfabet(String ordine) {
        String alfabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String alfabetInvers = "z, y, x, w, v, u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b, a";

        if (ordine.equals("invers")) {
            return alfabetInvers;
        }
        return alfabet;
    }

    public int coloreazaTablaSah(int lungime, int latiem) {
        Random random = new Random();
        int[][] tabla = new int[lungime][latiem];

        for (int i = 0; i < lungime; i++) {
            for (int j = 0; j < latiem; j++) {
                tabla[i][j] = random.nextInt(2);
            }
        }

        for (int i = 0; i < lungime; i++) {
            for (int j = 0; j < latiem; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        return 0;
    }



    public String spuneLaRevedere() {
        return "La revedere!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int[] birthDate) {
        this.birthDate = birthDate;
    }
}
