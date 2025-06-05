package org.example.SwingPractice.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton(); //create global parameter
    JLabel label = new JLabel();

    public MyFrame() {

        ImageIcon icon = new ImageIcon("abc.png");



        button.setText("Button");
        button.setBounds(10, 10, 200, 100);

        //butonul face actiunea din Action listener
        button.addActionListener(this);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Serif", Font.BOLD, 20));
        button.setForeground(Color.GREEN);
        //button.setEnabled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400, 400);

        this.add(button);
        this.add(label);



        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //verificam daca evenimentul e de la buton, in caz ca da, facem ceva
        if(e.getSource()==button){
            System.out.println("Button clicked");
            label.setVisible(true);
        }
    }
}
