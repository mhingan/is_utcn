package org.example.lab4.ex2;

import java.util.Arrays;

public class X {
    private char[] characters = {'a', 'b', 'c', 'd', 'e', 'f'};
    protected String str = "Ana are mere";
    int a = 10;

    //constructorul explicit cu param
    public X(char[] characters, String str, int a) {
        this.characters = characters;
        this.str = str;
        this.a = a;
    }

    public X() {
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public void printConstructor(X x){
        System.out.println("Sirul de caractere: " + Arrays.toString(x.getCharacters()));
        System.out.println("Stringul: " + str);
        System.out.println("Int: " + x.a);
    }

    @Override
    public void finalize(){
        System.out.println("metoda finalize a fost apelata");
    }
}
