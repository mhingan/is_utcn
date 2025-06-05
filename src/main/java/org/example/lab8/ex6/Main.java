package org.example.lab8.ex6;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        CitireFisier citireFisier = new CitireFisier();

        List<Person> people = citireFisier.citireDate("/Users/mihaita.hingan/IdeaProjects/is_utcn/dateTest.csv");
        System.out.println("Am citit " + people.size() + " persoane din fișier.");


        citireFisier.persoaneNascuteInDecembrie(people);
        citireFisier.persoaneAndreiNicolae(people);
        citireFisier.personeCuNrTelNonRO(people);
        citireFisier.persoaneFaraFacebook(people);

    }
}
