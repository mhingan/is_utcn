package org.example.lab3;

import java.util.Random;
import java.util.Scanner;

//10. Fie un algoritm de criptare în cadrul căruia se ia un text de intrare A format din litere mici și mari.
//Separat, se definește un șir de caractere B, cărora li se asociază aleator câte un număr întreg de la 1 la
//100. Algoritmul verifică dacă literele din șirul B există în șirul A și face suma numerelor asociate acestora.
//La suma finală se adaugă pozițiile din șirul A la care au fost găsite caracterele din șirul B. Dacă suma finală
//este mai mare de 100, criptarea a fost validă. Afișați un mesaj corespunzător.
//Exemplu:
//Șirul A = „aTmPpDsst”
//Șirul B = „ams”
//Valorile asociate elementelor din șirul B: 11 33 7
//Suma: (11+33+7+7) + (1+3+7+8) = 77 → CRIPTARE NEVALIDĂ

public class Problema10 {
    public static void main(String[] args) {

        //string-ul b este setat manual de catre user
        String b = "ams";

        //initalizez un obiect scanner si citesc string-ul a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți un string A: ");
        String a = scanner.nextLine();
        scanner.close();

        //generez un tablou de int, valori asociate string-ului b
        int[] valoriAsociate = generareNumere(b.length());

        //printez valorile asociate
        System.out.print("Valorile asociate elementelor din B: ");
        for (int valoare : valoriAsociate) {
            System.out.print(valoare + " ");
        }
        System.out.println();

        //verific suma valorilor
        int sumaFinala = verificare(a, b, valoriAsociate);

        //cu un if, printez in functie de rezultatul sumei
        if (sumaFinala > 100) {
            System.out.println("criptare valida");
        } else {
            System.out.println("criptare nevalida");
        }
    }

    //metoda care imi genereaza numere random pentru string-ul b
    public static int[] generareNumere(int lungime) {
        //instantiere obiect din clasa random
        Random random = new Random();
        //creare tablou cu lungime X
        int[] valori = new int[lungime];

        //asignare valori random fiecarui element din tablou (valori intre 0 si 100)
        for (int i = 0; i < lungime; i++) {
            valori[i] = random.nextInt(100);
        }
        return valori;
    }

    //metoda care calculeaza suma
    public static int verificare(String a, String b, int[] valoriAsociate) {
        int suma = 0;

        //verific daca caracterele se afla in ambele stringuri
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    //daca da, le adaug la suma
                    suma += valoriAsociate[j];
                }
            }
        }
        //la sfarsit printez suma
        System.out.println("Suma finală: " + suma);
        return suma;
    }
}


/**
 * /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58656:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab3.Problema10
 * Introduceți un string A:
 * shdgysyvj`sjcgyvyjvy
 * Valorile asociate elementelor din B: 28 96 99
 * Suma finală: 297
 * criptare valida
 *
 * Process finished with exit code 0
 * */