package org.example.lab10.ex1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //creez un nou frame
        Frame frame = new Frame("Exercitiul 1");
        //adaug panelul meu acestui frame
        frame.add(new MyPanel());
        //setez dimensiunea
        frame.setSize(500, 500);
        //il fac vizibil
        frame.setVisible(true);


    }
}
