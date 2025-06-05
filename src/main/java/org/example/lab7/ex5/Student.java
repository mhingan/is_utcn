package org.example.lab7.ex5;

public class Student {
    private String name;
    private int grupa;
    private double media;

    public Student(String name, int grupa, double media) {
        this.name = name;
        this.grupa = grupa;
        this.media = media;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return name + ", " + grupa + ", " + media;
    }
}
