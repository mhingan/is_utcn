package org.example.lab5.ex3;

public class Cub extends FiguraSpatiala{
    private int latura;

    @Override
    public double aria() {
        return 6 * Math.pow(latura, 2);
    }

    @Override
    public String toString() {
        return "Cub";
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
}
