package org.example.InClass.lab4.ex9;

public class Student {
    private String name;
    private int[] nrTel;
    private double media;

    Student(String name, int[] nrTel, double media) {
        this.name = name;
        this.nrTel = nrTel;
        this.media = media;
    }

    public Student() {}


    public void verificaNr(int[] nr){
        if(nr.length != 10){
            System.out.println("NUMAR DE TELEFON INCORECT");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public long getNrTel() {
//        return nrTel;
//    }
//
//    public void setNrTel(long nrTel) {
//        this.nrTel = nrTel;
//    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
