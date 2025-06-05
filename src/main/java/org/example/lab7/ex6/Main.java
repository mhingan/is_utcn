package org.example.lab7.ex6;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        //sorted set, setat by default cu ComparareAngajati(), crescator dupa nume si descresactor dupa varsta
        SortedSet<Angajat> angajati = new TreeSet<>(new ComparareAngajati());

        angajati.add(new Angajat("Maria", 28, 3500.0));
        angajati.add(new Angajat("Ion", 45, 4200.5));
        angajati.add(new Angajat("Elena", 31, 3900.0));
        angajati.add(new Angajat("George", 38, 4100.0));
        angajati.add(new Angajat("Ana", 25, 3200.0));
        angajati.add(new Angajat("Vlad", 29, 3600.0));
        angajati.add(new Angajat("Andreea", 40, 4500.0));
        angajati.add(new Angajat("Mihai", 33, 3700.0));
        angajati.add(new Angajat("Radu", 26, 3100.0));
        angajati.add(new Angajat("Ioana", 36, 4300.0));


        System.out.println("Sortare 1: ");
        //afisare lista sortata cu Comparator - new ComparareAngajati()
        for(Angajat angajat : angajati){
            System.out.println(angajat);
        }

        //pentru a putrea folosi Collections.sort
        List<Angajat> listaAngajati = new ArrayList<>(angajati);
        Collections.sort(listaAngajati);

        System.out.println("Sortae2: ");
        for (Angajat a : listaAngajati) {
            System.out.println(a);
        }



    }
}
