package org.example.lab10.ex1;


import java.awt.*;

public class MyPanel extends Panel {

//constructor
    public MyPanel() {
    }

    public void paint(Graphics g) {
        //setez size-ul ferestrei
        int width = getWidth();
        int height = getHeight();
        //setez culoarea ferestrei
        g.setColor(Color.WHITE);
        //creez un string
        String mihaita = "Mihaita Hingan - 2521";
        //setez culoarea stringului
        g.setColor(Color.BLUE);
        //afisez string-ul pe mijloc mereu
        g.drawString(mihaita, width / 2, height / 2);

    }
}
