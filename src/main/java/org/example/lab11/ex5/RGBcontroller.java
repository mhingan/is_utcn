package org.example.lab11.ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RGBcontroller {


    public static void main(String[] args) {
        JLabel labelR = new JLabel("Red");
        JLabel labelG = new JLabel("Green");
        JLabel labelB = new JLabel("Blue");

        JTextField tfR = new JTextField();
        JTextField tfG = new JTextField();
        JTextField tfB = new JTextField();

        //creez un jframe
        JFrame frame = new JFrame("RGB Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 270);

        //creez cate un JPanel pentru fiecare: R - G - B
        JPanel panelR = new JPanel();
        panelR.setBounds(0, 0, 400, 50);
        //adaugare label
        panelR.add(labelR);


        //creez componenta text si o adaug panelului
        tfR.setPreferredSize(new Dimension(100, 25));
        panelR.add(tfR);
        //creez cate un JPanel pentru fiecare: R - G - B
        JPanel panelG = new JPanel();
        panelG.setBounds(0, 50, 400, 50);
        //adaugare label
        panelG.add(labelG);
        //creez componenta text si o adaug panelului
        tfG.setPreferredSize(new Dimension(100, 25));
        panelG.add(tfG);


        //creez cate un JPanel pentru fiecare: R - G - B
        JPanel panelB = new JPanel();
        panelB.setBounds(0, 100, 400, 50);
        //adaugare label
        panelB.add(labelB);
        //creez componenta text si o adaug panelului
        tfB.setPreferredSize(new Dimension(100, 25));
        panelB.add(tfB);


        //panel pentru buton
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 150, 400, 55);
        JButton button1 = new JButton("OK");
        button1.setPreferredSize(new Dimension(75, 30));
        buttonPanel.add(button1);


        //panel si componenta JLable
        JPanel labelPanel = new JPanel();
        labelPanel.setBounds(0, 205, 400, 50);
        JLabel outputLable = new JLabel();
        outputLable.setPreferredSize(new Dimension(400, 25));
        labelPanel.add(outputLable);

        //adaugare functionalitate buton
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int red = Integer.parseInt(tfR.getText());
                    int green = Integer.parseInt(tfG.getText());
                    int blue = Integer.parseInt(tfB.getText());

                    boolean notOKCol = colorNotOK(red, green, blue);

                    if (notOKCol) {
                        outputLable.setText("RGB depasesc limitele 0 - 255");
                        outputLable.setForeground(Color.RED);
                    }

                    outputLable.setText("R: " + red + " G: " + green + " B: " + blue);
                    Color c = new Color(red, green, blue);
                    outputLable.setForeground(c);

                } catch (Exception exception) {
                    outputLable.setText("Eroare parasare Text to INT: " + exception.getMessage());
                    outputLable.setForeground(Color.RED);
                    System.out.println("Eroare parasare Text to INT: " + exception.getMessage());
                }


            }
        });


        frame.setLayout(null);

        frame.add(panelR);
        frame.add(panelG);
        frame.add(panelB);
        frame.add(buttonPanel);
        frame.add(labelPanel);
        frame.setVisible(true);


    }

    public static boolean colorNotOK(int red, int green, int blue) {
        if(red > 255 || green > 255 || blue > 255 || red < 0 || green < 0 || blue < 0) {
            return true;
        }
        return false;
    }
}
