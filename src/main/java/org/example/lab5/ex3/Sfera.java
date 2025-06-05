package org.example.lab5.ex3;

public class Sfera extends FiguraSpatiala{
    private int raza;

    @Override
    public double aria() {
        return Math.PI * Math.pow(raza, 2);
    }

    @Override
    public String toString() {
        return "Sfera";
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
