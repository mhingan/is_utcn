package org.example.lab6.ex8;



public class NumarInmatriculare {
    String judet;
    int numar;
    String valAlfabatica;

    VerificareNumarInmatriculare verificareNumarInmatriculare = new VerificareNumarInmatriculare();


    public NumarInmatriculare() {
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
            this.judet = judet;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
            this.numar = numar;

    }

    public String getValAlfabatica() {
        return valAlfabatica;
    }

    public void setValAlfabatica(String valAlfabatica) {
        this.valAlfabatica = valAlfabatica;
    }

    @Override
    public String toString() {
        return "Numarul de inmatriculare: " + judet + " " + numar + " " + valAlfabatica;
    }
}
