package org.example.lab10.ex3;


import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class Ex3 extends Frame {

    // variabila pentru imagine
    private Image img;

    // numele fisierului care contine imaginea
    private String filename = "imagine.png";

    // fontul folosit pentru text
    private Font font = new Font("Arial", Font.BOLD, 20);

    // culoarea textului creata manual cu RGB
    private Color textColor = new Color(120, 50, 180);

    // constructorul ferestrei
    public Ex3(String title) {
        super(title); // seteaza titlul ferestrei

        setSize(500, 500); // dimensiunea ferestrei
        setLayout(new FlowLayout()); // layout simplu

        // incarca imaginea din fisier
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            System.out.println("Imaginea nu a putut fi incarcata.");
        }

        setVisible(true); // face fereastra vizibila
    }

    // metoda de desenare (automata cand se afiseaza fereastra)
    public void paint(Graphics g) {
        if (img != null) {
            // deseneaza imaginea in fereastra la pozitia si dimensiunea specificata
            g.drawImage(img, 50, 50, 400, 300, this);

            // seteaza fontul si culoarea pentru text
            g.setFont(font);
            g.setColor(textColor);

            // afiseaza numele fisierului sub imagine
            g.drawString("Fisier: " + filename, 50, 370);
        }
    }

    // punctul de intrare in program
    public static void main(String[] args) {
        new Ex3("Imagine + Nume fisier"); // creeaza si afiseaza fereastra
    }
}
