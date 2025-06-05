package org.example.lab5.ex3;

public class Vopsitorie implements Vopsea {
    Cub cub;
    Cilindru cilindru;
    Sfera sfera;

    public double calculeazaCantitateVopsea(FiguraSpatiala figuraSpatiala) {
        return figuraSpatiala.aria() / Vopsea.vopseaPeUnitateaDeSuprafata;
    }
}
