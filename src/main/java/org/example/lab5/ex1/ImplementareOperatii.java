package org.example.lab5.ex1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//clasa de implementare a operatiilor din interfata Operatii

public class ImplementareOperatii implements Operatii {
    public double adunare(double a, double b) {
        return a + b;
    }

    public double scadere(double a, double b) {
        if (a > b) {
            return a - b;
        }
        return b - a;
    }

    public double inmultire(double a, double b) {
        return a * b;
    }

    public double impartire(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double radical(double a, double b) {
        if(a!=0&&b!=0){
            return sqrt(a * b);
        }
        if(a==0){
            return b;
        }
        return a;
    }

    public double ridicareLaPutere(double a, double b) {
        return pow(a, b);
    }
}
