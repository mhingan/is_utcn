package org.example.lab4.Ex7;

import java.time.LocalDate;
import java.util.Random;

public class Copil {
    protected String name;
    protected int[] birthDate;

    public Copil(String name, int[] birthDate) {
        this.name = "";
        this.birthDate = new int[]{0, 0, 0};
    }
    public Copil() {}

    //se prezinta
    public String se_prezinta() {
        return "Salut, numele meu este " + this.name;
    }

    //spune ce varsta are
    public String spune_varsta() {
        LocalDate data_actuala = LocalDate.now();
        int an = data_actuala.getYear();
        int luna = data_actuala.getMonthValue();

        int an_copil = birthDate[2];
        int luna_copil = birthDate[1];

        int an_final = an - an_copil;
        int luna_finala = luna - luna_copil;

        return "Am varsta de " + an_final + " ani si " + luna_finala + " luni";

    }

    //calculeaza suma numere mai mici decta 10
    public String calculeaza_numere(int a, int b) {
        if (a > 10 || b > 10 || a < 0 || b < 0) {
            return "Nu stiu sa calculez numere mai mari de 10 sau mai mici decat 0";
        } else {
            int sum = a+b;
            return "Suma numerelor " + a + " si " + b + " este " + sum;
        }
    }

    //spune alfabetul
    public String spune_alfabet(String cumSaSpuna) {

        char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String alfabetString = new String(alfabet);
        StringBuilder alfabet_invers = new StringBuilder();
        if (cumSaSpuna.equals("invers")) {
            for (int i = alfabet.length - 1; i >= 0; i--) {
                alfabet_invers.append(alfabet[i]);
            }
            return alfabet_invers.toString();
        }
        return alfabetString;
    }

    //spune la revedere
    public String spune_la_revedere(){
        return "L arevedere!";
    }


    //coloreaza tabla sah
    public int[][] coloreaza_tabla_sah(int l, int w){
        Random rand = new Random();
        int[][] tabla = new int[l][w];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                tabla[i][j] = rand.nextInt(2);
            }
        }

        //cu un alt for afisez tabla de sah
        for(int i = 0; i < l; i++){
            for(int j = 0; j < w; j++){
                System.out.println(tabla[i][j] + "");
            }
        }
        return tabla;
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
