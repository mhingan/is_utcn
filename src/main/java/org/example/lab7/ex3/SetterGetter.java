package org.example.lab7.ex3;

public class SetterGetter<T> {
    private T nume;
    private T varsta;

    public SetterGetter(T nume, T varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public T getNume() {
        return nume;
    }

    public void setNume(T nume) {
        this.nume = nume;
    }

    public T getVarsta() {
        return varsta;
    }

    public void setVarsta(T varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + ", Varsta: " + varsta;
    }
}
