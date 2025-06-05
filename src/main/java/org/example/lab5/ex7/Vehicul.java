package org.example.lab5.ex7;

public class Vehicul {
    private int nrMaximPasageri;
    private String culoare;
    private double vitezaMaximaDeDeplasare;

    public Vehicul(String culoare, double vitezaMaximaDeDeplasare, int nrMaximPasageri) {
        this.culoare = culoare;
        this.nrMaximPasageri = nrMaximPasageri;
        this.vitezaMaximaDeDeplasare = vitezaMaximaDeDeplasare;
    }

    public int getNrMaximPasageri() {
        return nrMaximPasageri;
    }

    public void setNrMaximPasageri(int nrMaximPasageri) {
        this.nrMaximPasageri = nrMaximPasageri;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getVitezaMaximaDeDeplasare() {
        return vitezaMaximaDeDeplasare;
    }

    public void setVitezaMaximaDeDeplasare(double vitezaMaximaDeDeplasare) {
        this.vitezaMaximaDeDeplasare = vitezaMaximaDeDeplasare;
    }
}
