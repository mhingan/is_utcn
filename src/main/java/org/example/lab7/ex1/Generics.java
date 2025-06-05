package org.example.lab7.ex1;

public class Generics<T> {

    public T alege(T var1, T var2) {
        if (var1.equals(var2)) {
            return var1;
        } else {
            return var2;
        }
    }

}
