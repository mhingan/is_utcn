package org.example.lab5.ex2;

public class TriunghiEchilateral implements FormaGeometrica{
    @Override
    public double aria(int a, int b) {
        //a - o sa fie baza triunghiului
        //b - o sa fie inaltimea triunghiului
        return (double) (a * b) /2; //fac cast la tipul de date double
    }

    @Override
    public double perimetru(int a, int b) {
        if(a==b){
            return 3*a;//are toate laturile egale, deci p = a + b + c;
        }
        return -111111; //in loc de eroare
    }
}
