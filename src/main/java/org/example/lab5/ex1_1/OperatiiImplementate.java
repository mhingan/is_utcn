package org.example.lab5.ex1_1;

public class OperatiiImplementate implements Operatii_adunare, Operatii_scadere, Operatii_inmultire, Operatii_impartire{
    @Override
    public double adunare(double a, double b) {
        return a + b;
    }

    @Override
    public double scadere(double a, double b) {
        return a - b;
    }

    @Override
    public double inmultire(double a, double b) {
        return a * b;
    }

    @Override
    public double impartire(double a, double b) {
        if(b == 0){
            return a;
        }
        return a / b;
    }


}
