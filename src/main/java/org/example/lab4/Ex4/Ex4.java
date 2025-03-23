package org.example.lab4.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("", 0, 0);
        persoana1.setNume("Ana");
        persoana1.setLatitudine(43527);
        persoana1.setLongitudine(776849);

        Persoana persoana2 = new Persoana();
        persoana2.setNume("Mihaita");
        persoana2.setLatitudine(32549);
        persoana2.setLongitudine(637822);

        Persoana persoana3 = new Persoana();
        persoana3.setNume("Irina");
        persoana3.setLatitudine(456777);
        persoana3.setLongitudine(122119);

        print(persoana1);
        print(persoana2);
        print(persoana3);



    }

    public static void print(Persoana persoana) {
        System.out.println("\nNume: " + persoana.getNume());
        System.out.println("Latitudine si longitudine: " + persoana.getLatitudine() + ", " + persoana.getLongitudine());
    }
}
