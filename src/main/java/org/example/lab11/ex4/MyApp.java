package org.example.lab11.ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApp {
    public static void main(String[] args) {

        //creare frame
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 220);
        frame.setLayout(null);

        //nume
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(150, 30));
        JLabel nameLabel = new JLabel("Name: ");

        //grupa
        JTextField grupaField = new JTextField();
        grupaField.setPreferredSize(new Dimension(150, 30));
        JLabel grupaLabel = new JLabel("Grupa: ");

        //buton adaugare
        JButton addButton = new JButton("Procesare");
        addButton.setPreferredSize(new Dimension(150, 30));
        addButton.setSize(200, 50);

        //creez un Panel pentru fiecare componenta - NUME
        JPanel panelForName = new JPanel();
        panelForName.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelForName.setBounds(0, 0, 400, 50);
        //panelForName.setBackground(Color.GRAY);
        panelForName.add(nameLabel);
        panelForName.add(nameField);

        //grupa
        JPanel panelForGrupa = new JPanel();
        panelForGrupa.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelForGrupa.setBounds(0, 50, 400, 50);
        //panelForGrupa.setBackground(Color.WHITE);
        panelForGrupa.add(grupaLabel);
        panelForGrupa.add(grupaField);

        //buton
        JPanel panelForAdd = new JPanel();
        panelForAdd.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelForAdd.setBounds(0, 100, 400, 50);
        panelForAdd.add(addButton);


        //panel pentru JLabel unde afisez datele scrie in textFields
        JPanel outputPanel = new JPanel();
        outputPanel.setBounds(0, 150, 400, 50);
        outputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel outputLabel = new JLabel("Output: ");
        outputLabel.setPreferredSize(new Dimension(150, 30));
        outputPanel.add(outputLabel);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nameField.getText().isEmpty() || grupaField.getText().isEmpty()) {
                    outputLabel.setText("Eroare procesare.");
                    outputLabel.setForeground(Color.RED);
                    System.out.println("Eroare in setare nume si grupa. Campuri goale.");
                } else {
                    outputLabel.setText("Nume: " + nameField.getText() + ", Grupa: " + grupaField.getText());
                    outputLabel.setForeground(Color.GREEN);
                    System.out.println("Date setate cu succes.");
                }
            }
        });



        frame.add(panelForName);
        frame.add(panelForGrupa);
        frame.add(panelForAdd);
        frame.add(outputPanel);


        frame.setVisible(true);



    }
}
