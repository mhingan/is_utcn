package org.example.lab4.Ex4;

public class Persoana {
    private String nume;
    private float latitudine;
    private float longitudine;

    public Persoana(String nume, float latitudine, float longitudine) {
        this.nume = null;
        this.latitudine = 0;
        this.longitudine = 0;
    }

    public Persoana() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(float latitudine) {
        this.latitudine = latitudine;
    }

    public float getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(float longitudine) {
        this.longitudine = longitudine;
    }


    //    public void finalize(){
//        System.out.println("metoda finalize a fost apelata");
//    }

}
