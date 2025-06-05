package org.example.SwingPractice.LayoutManager;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 400));
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout());


        panel.add(new Button("B1"));
        panel.add(new Button("B2"));
        panel.add(new Button("B3"));
        panel.add(new Button("B4"));
        panel.add(new Button("B5"));
        panel.add(new Button("B6"));
        panel.add(new Button("B7"));
        panel.add(new Button("B8"));
        panel.add(new Button("B9"));
        panel.add(new Button("B0"));

        frame.add(panel);




        panel.setVisible(true);
    }
}
