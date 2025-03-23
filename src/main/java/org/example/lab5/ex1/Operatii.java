package org.example.lab5.ex1;

//1. Să se implementeze o interfață Java care conține prototipurile metodelor de adunare, scădere, înmulțire,
//împărțire, radical și ridicare la putere. Toate metodele vor avea doi parametri de tip double și vor specifica
//tipul returnat double.
//Implementați interfața astfel încât operațiile să fie definite în cadrul unei clase. Instanțiați clasa și verificați
//operațiile implementate.


//definire intefata cu metodele abstracte mentionate in cerinta
public interface Operatii {
    double adunare(double a, double b);
    double scadere(double a, double b);
    double inmultire(double a, double b);
    double impartire(double a, double b);
    double radical(double a, double b);
    double ridicareLaPutere(double a, double b);
}
