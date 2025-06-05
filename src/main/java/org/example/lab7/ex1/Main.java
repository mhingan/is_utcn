package org.example.lab7.ex1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pentru Integer");
        Generics<Integer> generics = new Generics<>();
        System.out.println(generics.alege(1, 2));
        System.out.println(generics.alege(3, 3));

        System.out.println("Pentru Double");
        Generics<Double> generics2 = new Generics<>();
        System.out.println(generics2.alege(3.3, 4.4));
        System.out.println(generics2.alege(5.89, 5.89));

        System.out.println("Pentru String");
        Generics<String> generics3 = new Generics<>();
        System.out.println(generics3.alege("hello", "world"));
        System.out.println(generics3.alege("ana", "ana"));
    }
}
