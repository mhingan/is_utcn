package org.example.lab12.ex1;


import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {
        //creare frame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 600);

        //setare Layout ca si grid, care contine 6 randuri si 4 coloane
        frame.setLayout(new GridLayout(6, 4));


        //creare butaone calculator
        JButton[] buttons = {new JButton("AC"), new JButton("+/-"), new JButton("%"), new JButton(":"),
                new JButton("7"), new JButton("8"), new JButton("9"), new JButton("x"),
                new JButton("4"), new JButton("5"), new JButton("6"), new JButton("-"),
                new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"),
                new JButton("="), new JButton(","), new JButton("0"), new JButton("!")};

        //adaugare butone in frame
        for (int i = 0; i < buttons.length; i++) {
            frame.add(buttons[i]);
        }


        //creare LabelField - unde o sa afisez rezultatul cand calculez
        JLabel labelResult = new JLabel("0");
        frame.add(labelResult);


        frame.setVisible(true);


    }


}