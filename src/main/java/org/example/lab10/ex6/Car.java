package org.example.lab10.ex6;

import java.awt.*;

public class Car extends Panel {

    //constructor
    public Car() {
    }

    public void paint(Graphics g) {
        //setez size-ul ferestrei
        int width = getWidth();
        int height = getHeight();

        //setez culoarea
        g.setColor(Color.BLUE);
        //creez o roata
        g.fillOval(180, 300, 60, 60);

        //setez culoarea
        g.setColor(Color.YELLOW);
        //creez o roata
        g.fillOval(370, 300, 60, 60);

        //creez masina
        g.setColor(Color.ORANGE);
        g.fillRect(160, 220, 280, 80);
        g.fillRect(160, 150, 110, 80);

    }
}
