package org.example.lab5.ex3;

public class Cilindru extends FiguraSpatiala {
    private int raza_basei;
    private int inaltime;

    @Override
    public double aria() {
        return (2 * Math.PI * raza_basei * inaltime) + 2 * Math.PI * Math.pow(raza_basei, 2);
    }

    @Override
    public String toString() {
        return "Cilindru";
    }

    public int getRaza_basei() {
        return raza_basei;
    }

    public void setRaza_basei(int raza_basei) {
        this.raza_basei = raza_basei;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }
}
