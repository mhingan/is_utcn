package org.example.SwingPractice.Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //creare JLabel
        JLabel label = new JLabel("Panel 1");
        JLabel label2 = new JLabel("Panel 2");
        JLabel label3 = new JLabel("Panel 3");

        //JPanel = container
        //creare paneluri
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 0, 200, 200);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(200, 0, 200, 200);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 200, 400, 200);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 400);

        //adaugare panel la frame
        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);

        //adaugam labelul unui panel
        bluePanel.add(label);
        redPanel.add(label2);
        greenPanel.add(label3);


        frame.setVisible(true); //pun mereu la sfarsit, sa fiu sigur ca imi apare apar toate elementele
    }
}
