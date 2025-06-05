package org.example.lab10.ex6;

import org.example.lab10.ex1.MyPanel;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //creez un nou frame
        Frame frame = new Frame("Exercitiul 6");
        //adaug panelul meu acestui frame
        frame.add(new Car());
        //setez dimensiunea
        frame.setSize(500, 500);
        //il fac vizibil
        frame.setVisible(true);


    }
}

