package org.example.lab5.ex2;

public class Patrat implements FormaGeometrica{
    @Override
    public double aria(int a, int b) {
        if(a==b){
            return a*b; //pt. ca aria e l*l - verific daca ambele laturi sunt egale
        }
        return -1111111; //in loc de eroare
    }

    @Override
    public double perimetru(int a, int b) {
        if(a==b){
            return 4*a;
        }
        return -1111111; //in loc de eroare
    }
}
