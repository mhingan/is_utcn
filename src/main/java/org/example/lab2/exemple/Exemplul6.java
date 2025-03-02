package org.example.lab2.exemple; // Pachetul în care se află clasa

import javax.swing.*; // Importă biblioteca Swing pentru interfața grafică
import java.awt.*; // Importă biblioteca AWT pentru desenare grafică

// Clasa Exemplul6 extinde JPanel pentru a crea un panou personalizat
public class Exemplul6 extends JPanel {
    private static final long serialVersionUID = 1L; // Evită avertismente legate de serializare

    // Metoda paintComponent este suprascrisă pentru a permite desenarea pe panou
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Apelăm metoda din clasa de bază pentru a asigura un desen corect

        int totalP = 6; // Numărul total de puncte ale poligoanelor

        // Coordonatele x și y pentru primul poligon (contur gol)
        int xP1[] = {110, 50, 200, 20, 170, 110};
        int yP1[] = {20, 190, 80, 80, 190, 20};
        g.drawPolygon(xP1, yP1, totalP); // Desenăm primul poligon fără umplere

        // Coordonatele x și y pentru al doilea poligon (colorat)
        int xP2[] = {310, 250, 400, 220, 370, 310};
        int yP2[] = {20, 190, 80, 80, 190, 20};

        g.setColor(Color.blue); // Setăm culoarea de desenare la albastru
        g.fillPolygon(xP2, yP2, totalP); // Desenăm și umplem al doilea poligon
    }
} // Sfârșitul clasei Exemplul6
