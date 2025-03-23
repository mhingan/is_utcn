package org.example.lab4.ex2;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\nApelare constructor cu valorile implicite");
        X x = new X();
        int a = x.a;
        String b= x.str;
        char[] c= x.getCharacters();
       x.printConstructor(x);


        System.out.println("\nApelare constructor cu valori noi");
        char[] chars = {'a', 'b', 'c'};
        String str = "Ana";
        int nr =  20;
        X x_1 = new X(chars, str, nr);
        x_1.printConstructor(x_1);
    }
}
