package org.example.lab12.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass extends JFrame {

    public MyClass() {
        this.setTitle("My Class");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        //creare JLabel pentru panel
        JLabel label = new JLabel("R:");
        //creare JPanel slider
        JPanel panelSlider1 = new JPanel();
        panelSlider1.setBounds(0, 0, 500, 40);

        JSlider sliderR = new JSlider();
        sliderR.setMinimum(0);
        sliderR.setMaximum(255);
        panelSlider1.add(label);
        panelSlider1.add(sliderR);


        //creare JLabel pentru panel
        JLabel labelG = new JLabel("G:");
        //creare JPanel slider
        JPanel panelSliderG = new JPanel();
        panelSliderG.setBounds(0, 40, 500, 40);

        JSlider sliderG = new JSlider();
        sliderG.setMinimum(0);
        sliderG.setMaximum(255);
        panelSliderG.add(labelG);
        panelSliderG.add(sliderG);

        //creare JLabel pentru panel
        JLabel labelB = new JLabel("B:");
        //creare JPanel slider
        JPanel panelSliderB = new JPanel();
        panelSliderG.setBounds(0, 80, 500, 40);

        JSlider sliderB = new JSlider();
        sliderB.setMinimum(0);
        sliderB.setMaximum(255);
        panelSliderG.add(labelB);
        panelSliderG.add(sliderB);


        //creare patrat ca si JPanel pentru a-i seta culoare
        JPanel panelSlider = new JPanel();
        panelSlider.setBounds(200, 180, 100, 100);


        //creare panel Buton
        JPanel panelButon = new JPanel();
        panelButon.setBounds(200, 140, 100, 50);

        JButton button = new JButton("Color");
        button.setPreferredSize(new Dimension(70, 30));
        panelButon.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Color c = new Color(sliderR.getValue(), sliderG.getValue(), sliderB.getValue());
                panelSlider.setBackground(c);
            }
        });



        this.add(panelSlider1);
        this.add(panelSliderG);
        this.add(panelSliderB);
        this.add(panelSlider);
        this.add(panelButon);

        this.setVisible(true);
    }
}
