package org.example.SwingPractice.creareSimpla;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); //creare frame
        frame.setTitle("SwingPractice"); //setare titlu
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setam "x" sa inchida programul la apasrea x-ului

        //schimbare logo fereastra
        ImageIcon icon = new ImageIcon("images/abc.png"); //creaza o imagine de tip icon
        frame.setIconImage(icon.getImage());//setare logo fereastra

        frame.getContentPane().setBackground(new Color(150, 213, 155));//setare culoare de fundal a ferestrei - sau cu Color.BLUE


        frame.setResizable(false); // nu putem schimba dimeniunea ferestrei
        frame.setSize(800, 600); //seteare dimensiune
        frame.setVisible(true); //facem frame-ul vizibil

    }
}
