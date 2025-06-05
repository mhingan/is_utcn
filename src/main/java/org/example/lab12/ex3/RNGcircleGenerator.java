package org.example.lab12.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RNGcircleGenerator extends JFrame {

    int culoareCerc;
    int scor = 0;
    boolean start = false;
    JTextArea textAreaScor = new JTextArea();


    public RNGcircleGenerator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("RNG Circle Generator");
        this.setSize(500, 500);
        this.setLayout(null);


        //creare butaoen
        JButton buttonR = new JButton("Red");
        buttonR.setPreferredSize(new Dimension(70, 30));
        buttonR.setForeground(Color.RED);

        JButton buttonB = new JButton("Black");
        buttonB.setPreferredSize(new Dimension(70, 30));
        buttonB.setForeground(Color.BLACK);

        JButton buttonStart = new JButton("START");
        buttonStart.setPreferredSize(new Dimension(70, 35));
        buttonStart.setForeground(Color.BLACK);


        //creare panel pentru butoanele de start, gegru si rosu
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBounds(0, 300, 250, 200);
        buttonsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        buttonsPanel.add(buttonR);
        buttonsPanel.add(buttonB);
        buttonsPanel.add(buttonStart);


        //JPanel afisare scor + timp
        JPanel scorPanel = new JPanel();
        scorPanel.setBounds(250, 300, 250, 200);
        scorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        scorPanel.add(textAreaScor);

        //JTextField pentru afisare scor
        textAreaScor.setEditable(false);
        textAreaScor.setLineWrap(true);
        textAreaScor.setWrapStyleWord(true);
        textAreaScor.setFont(new Font("Monospaced", Font.PLAIN, 12));



        //JPanel unde se vor afisa cercurile
        JPanel panelCercuri = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);

                if(start){
                    for (int i = 0; i < 10; i++) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        culoareCerc = new Random().nextInt(2);

                        if (culoareCerc == 0) {
                            g.setColor(Color.RED);
                            g.drawOval(30+i, 30+i, 30, 30);

                        } else {
                            g.setColor(Color.BLACK);
                            g.drawOval(30+i, 30+i, 30, 30);
                        }
                    }
                }

            }
        };

        panelCercuri.setBounds(0, 0, 500, 300);
        panelCercuri.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelCercuri.setVisible(false);


        //adaugare functionalitate butoane
        buttonStart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                start = true;
                panelCercuri.setVisible(true);
            }
        });


        //buton rosu
        buttonR.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(culoareCerc == 0){
                    scor += scor;
                    textAreaScor.setText("Score: " + scor + "\nTimp:");
                }
            }
        });

        //buton rosu
        buttonB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(culoareCerc == 1){
                    scor += scor;
                    textAreaScor.setText("Score: " + scor + "\nTimp:");
                }
            }
        });






        //afisare panel cercuri
        this.add(panelCercuri);
        //afisare panel butoane
        this.add(buttonsPanel);
        //afisare scor panel
        this.add(scorPanel);



        this.setVisible(true);
    }
}
