package org.example.SwingPractice.creareClasParinteCopil;

import javax.swing.*;
import java.awt.*;

//extind JFrame
public class MyFrame extends JFrame {

    //constructor
    public MyFrame() {
        this.setTitle("SwingPractice"); //setare titlu
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setam "x" sa inchida programul la apasrea x-ului

        //schimbare logo fereastra
        ImageIcon icon = new ImageIcon("images/abc.png"); //creaza o imagine de tip icon
        this.setIconImage(icon.getImage());//setare logo fereastra

        this.getContentPane().setBackground(new Color(150, 213, 155));//setare culoare de fundal a ferestrei - sau cu Color.BLUE


        this.setResizable(false); // nu putem schimba dimeniunea ferestrei
        this.setSize(800, 600); //seteare dimensiune
        this.setVisible(true); //facem frame-ul vizibil
    }
}
