package org.example.lab10.ex2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

// clasa principala mosteneste JFrame (fereastra Swing)
public class Main extends JFrame {

    // JLabel pentru afisarea imaginii
    private JLabel imagine;

    // JLabel pentru afisarea numelui fisierului
    private JLabel nume;

    // metoda principala (pornirea aplicatiei)
    public static void main(String[] args) {
        Main frame = new Main(); // creeaza obiectul de tip Main
        frame.setSize(400, 400); // seteaza dimensiunea ferestrei
        frame.setVisible(true);  // face fereastra vizibila
    }

    // constructorul clasei
    public Main() {
        setTitle("Frame"); // seteaza titlul ferestrei

        imagine = new JLabel(); // initializare label pentru imagine
        nume = new JLabel();    // initializare label pentru text

        // setari pentru font si culoare text
        Font font = new Font("Arial", Font.BOLD, 18);
        Color culoare = new Color(100, 160, 0); // culoare custom cu RGB

        // layout pentru plasarea componentelor in fereastra
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(imagine, BorderLayout.CENTER); // imaginea in centru
        panel.add(nume, BorderLayout.SOUTH);     // textul jos

        add(panel); // adauga panelul in fereastra

        try {
            // incarca imaginea din fisier
            File file = new File("imagine.png");
            Image img = ImageIO.read(file);

            // seteaza imaginea ca icon pentru JLabel
            ImageIcon icon = new ImageIcon(img);
            imagine.setIcon(icon);

            // seteaza textul si stilul pentru numele fisierului
            nume.setText(file.getName());
            nume.setFont(font);
            nume.setForeground(culoare);

        } catch (IOException e) {
            // mesaj de eroare daca imaginea nu se gaseste
            e.printStackTrace();
            nume.setText("Imaginea nu a fost gasita!");
        }
    }
}
