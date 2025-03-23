package org.example.lab5.ex2;

public class Main {
    public static void main(String[] args) {
        Patrat patrat = new Patrat();
        System.out.println("Aria patrat: "+patrat.aria(2, 2));
        System.out.println("Perimetru patrat: "+patrat.perimetru(2, 2));

        TriunghiEchilateral triunghiEchilateral = new TriunghiEchilateral();
        System.out.println("Aria triunghi: "+triunghiEchilateral.aria(2, 7));
        System.out.println("Perimetru triunghi: "+triunghiEchilateral.perimetru(4, 4));

        HexagonRegulat hexagonRegulat = new HexagonRegulat();
        System.out.println("Aria hexagon: "+hexagonRegulat.aria(2, 2));
        System.out.println("Perimetru hexagon: "+hexagonRegulat.perimetru(2, 2));

    }
}
