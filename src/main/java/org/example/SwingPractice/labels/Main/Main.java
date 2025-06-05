package org.example.SwingPractice.labels.Main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("abc.png"); //creare o noua imagine

        JLabel label = new JLabel(); //creare label
        label.setText("Hello World"); //textul afisat pe label
        label.setIcon(image); //setare imagine pentru label-ul nostru
        label.setHorizontalAlignment(JLabel.CENTER); //centrare in centru
        //label.setHorizontalTextPosition(SwingConstants.CENTER); // setare text la mijlcul imaginii

        label.setForeground(Color.ORANGE); //setare culoare text
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20)); //setare font text

        //setare culoare de fundal pentru label - care initial este toata pagina
        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        label.setBounds(0, 0, 300, 120); //seteaza pozitia in frame a labelului + dimeansiuea acestuia


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        frame.setLayout(null);

        frame.add(label); //adaugat labelu-ul in frame-ul nostru

        frame.setVisible(true);


    }
}
