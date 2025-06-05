package org.example.lab5.ex3;

public abstract class FiguraSpatiala {
    public String denumire;

    public abstract double aria();

    @Override
    public String toString(){
        return denumire;
    }
}
