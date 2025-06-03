package org.example.lab5.ex2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class HexagonRegulat implements FormaGeometrica {
    @Override
    public double aria(int a, int b) {
        double x = sqrt(3);
        double y = 3 * x;
        if (a == b) {
            return (y / 2) * pow(a, 2);
        }
        return -11111111;
    }

    @Override
    public double perimetru(int a, int b) {
        if (a == b) {
            return 6 * a; //are toate cele 6 laturi egale
        }
        return -111111;
    }
}
