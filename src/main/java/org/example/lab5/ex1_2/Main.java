package org.example.lab5.ex1_2;

//implementare metode folosind lambda
public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        //definesc un obiect din interfata OpAd, il instantiez cu expresia lambda, care e in felul urmator:
        //(a, b) - ii spun ca am 2 parametrii
        // -> ce rexzultat vreau
        // fac operratia cu cei 2 parametrii
        Operatii_adunare operatiiAdunare = (c, d) -> c + d;

        Operatii_scadere operatiiScadere = (c, d) -> c - d;

        Operatii_inmultire operatiiInmultire = (c, d) -> c * d;

        Operatii_impartire operatiiImpartire = (c, d) -> c % d;

        //printez rezultatul folosint sout
        //ca sa pot printa trebuie sa apelez prima data obiectul definit in clasa (Main) si apoi folosinf opertaorul "." apelez metoda din interfata functionala
        System.out.println(operatiiAdunare.adunare(a, b));
        System.out.println(operatiiScadere.scadere(b, a));
        System.out.println(operatiiInmultire.inmultire(a, b));
        System.out.println(operatiiImpartire.impartire(a, b));


    }
}
