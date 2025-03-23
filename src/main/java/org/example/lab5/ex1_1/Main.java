package org.example.lab5.ex1_1;

//1’
//. În loc de o interfață care conține toate metodele menționate anterior, să se implementeze 4 interfețe
//funcționale, câte una pentru fiecare metodă.
//Interfețele vor fi implementate în cadrul unei singure clase. Instanțiați clasa și verificați operațiile
//implementate.

public class Main {
    public static void main(String[] args) {
        OperatiiImplementate operatii = new OperatiiImplementate();
        System.out.println(operatii.adunare(3, 4));
        System.out.println(operatii.scadere(2, 3));
        System.out.println(operatii.inmultire(2, 3));
        System.out.println(operatii.impartire(3, 4));
    }
}
