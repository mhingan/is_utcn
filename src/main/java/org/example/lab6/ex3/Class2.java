package org.example.lab6.ex3;

public class Class2 extends Class1 implements Int1, Int2{

    public Class2(double a, double b) {
        super(a, b);
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public double produs(double a, double b) {
        return a * b;
    }
}
