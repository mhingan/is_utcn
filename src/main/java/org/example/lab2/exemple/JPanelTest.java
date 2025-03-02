package org.example.lab2.exemple; // Pachetul în care se află clasa

import javax.swing.*; // Importă biblioteca Swing pentru interfața grafică

// Clasa principală care creează și afișează fereastra
public class JPanelTest {
    public static void main(String args[]) { // Metoda principală a programului

        // Creăm o fereastră JFrame cu titlul "Exemplu desenare pe panou."
        JFrame frame = new JFrame("Exemplu desenare pe panou.");

        frame.add(new Exemplul6()); // Adăugăm panoul personalizat Exemplul6 în fereastră

        frame.setSize(440, 300); // Setăm dimensiunea ferestrei
        frame.setVisible(true); // Facem fereastra vizibilă

        // Setăm acțiunea de închidere a ferestrei pentru a termina programul la închidere
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // Sfârșitul metodei main
}
