package org.example.lab8.ex6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CitireFisier {

    //declar o lista de persone unde stochez datele citite din fisier
    List<Person> persons = new ArrayList<>();

    public List<Person> citireDate(String fileLocation) {

        //deschid fisierul pentru citire
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
            String line;

            reader.readLine(); // nu citesc prima linie

            while ((line = reader.readLine()) != null) {

                // Eliminam spatiile din jurul / si impartim linia in campuri
                String[] campuri = line.split("\\|");

                //verific daca am 5 elemente in sir
                if (campuri.length == 5) {

                    //creez cate un obiect de tip string pentru fiecare camp din fisier
                    String fName = campuri[0];
                    String lName = campuri[1];
                    String phone = campuri[2];
                    String dob = campuri[3];
                    String fb = campuri[4];

                    //creez un obiect de tip persoana cu dtaele salvate din fisier
                    Person person = new Person(fName, lName, phone, dob, fb);
                    //adaug persoana in lista mea initiala
                    persons.add(person);
                }
            }

            //inchid stream-ul de citire
            reader.close();

        } catch (IOException e) {
            System.out.println("Eroare in deschiderea sau citirea fisierului: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return persons;
    }


    public void persoaneNascuteInDecembrie(List<Person> people) throws IOException {

        //deschid fisierul pentru scriere
        BufferedWriter bufferW = new BufferedWriter(new FileWriter("personeNascuteInDecembrie.csv"));
        //scriu capul de tabel
        bufferW.write("Nume / Prenume / NumarTelefon / DataNasterii / LinkFB\n");

        //parcurg lista de persoane
        for (Person person : people) {
            //daca persoana e nascuta in decembrie o scriu in fisier
            if (person.getDateOfBirth().charAt(3) == 1 && person.getDateOfBirth().charAt(4) == 2) {
                try {
                    bufferW.write(person.getFirstName() + " / " + person.getLastName() + " / " + person.getPhoneNumber() + " / " + person.getDateOfBirth() + " / " + person.getLinkToFB() + "\n");
                } catch (IOException e) {
                    System.out.println("Eroare la adaugare date in fisier - personeNascuteInDecembrie.csv: " + e.getMessage());
                    throw new RuntimeException(e);
                }
            }

        }

        bufferW.close();

    }


    public void personeCuNrTelNonRO(List<Person> people) throws IOException {

        BufferedWriter bufferW = new BufferedWriter(new FileWriter("personeCuNrTelNonRO.csv"));

        //scriu capul de tabel
        bufferW.write("Nume / Prenume / NumarTelefon / DataNasterii / LinkFB\n");

        //parcurg lista de persone
        for (Person person : people) {
            //verific daca au numar de romania
            if (!(person.getPhoneNumber().startsWith("+4")) && person.getPhoneNumber().length() != 12 || !(person.getPhoneNumber().startsWith("07")) && person.getPhoneNumber().length() != 10) {
                try {
                    //le adaug in fisier pe cele care nu au nr de Romania
                    bufferW.write(person.getFirstName() + " / " + person.getLastName() + " / " + person.getPhoneNumber() + " / " + person.getDateOfBirth() + " / " + person.getLinkToFB() + "\n");
                } catch (IOException e) {
                    System.out.println("Eroare la adaugare date in fisier - personeCuNrTelNonRO.csv: " + e.getMessage());
                    throw new RuntimeException(e);
                }
            }
        }

        bufferW.close();
    }

    public void persoaneAndreiNicolae(List<Person> people) throws IOException {
        BufferedWriter bufferW = new BufferedWriter(new FileWriter("personeAndreiNicolae.txt"));

        //scriu capul de tabel
        bufferW.write("Nume / Prenume / NumarTelefon / DataNasterii / LinkFB\n");

        for (Person person : people) {
            if (person.getFirstName().equals("Andrei") || person.getFirstName().equals("Nicolae") || person.getLastName().equals("Andrei") || person.getLastName().equals("Nicolae")) {
                try {
                    bufferW.write(person.getFirstName() + " / " + person.getLastName() + " / " + person.getPhoneNumber() + " / " + person.getDateOfBirth() + " / " + person.getLinkToFB() + "\n");
                } catch (IOException e) {
                    System.out.println("Eroare la adaugare date in fisier - personeAndreiNicolae.txt: " + e.getMessage());
                    throw new RuntimeException(e);
                }
            }
        }
        bufferW.close();

    }

    public void persoaneFaraFacebook(List<Person> people) throws IOException {
        BufferedWriter bufferW = new BufferedWriter(new FileWriter("personeFaraFacebook.txt"));

        //scriu capul de tabel
        bufferW.write("Nume / Prenume / NumarTelefon / DataNasterii / LinkFB\n");

        // parcurg lista de persoane
        for (Person person : people) {

            // verific daca linkul de Facebook se termina cu cifre -> folosim regex corect
            if (person.getLinkToFB().startsWith("facebook.com/")) {

                //fac un obiect string din link-ul de fb
                String fb = person.getLinkToFB();
                //fac un substring, adica iau doar partea de dupa / si o salvez in obiect
                String finalulFb = fb.substring("facebook.com/".length());

                //verific daca partea de dupa / contine numia cifre
                if(finalulFb.matches("\\d+")){
                    try {
                        // scriu persoana in fisierul personeFaraFacebook.txt daca linkul e doar cifre
                        bufferW.write(person.getFirstName() + " / " + person.getLastName() + " / " + person.getPhoneNumber() + " / " + person.getDateOfBirth() + " / " + person.getLinkToFB() + "\n");


                    } catch (IOException e) {
                        // afised mesaj de eroare daca scrierea in fisier esueaza
                        System.out.println("Eroare la adaugare date in fisier - personeFaraFacebook.txt: " + e.getMessage());

                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }


}


