package org.example.lab6.ex10.dbInteraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person = new Person();
        person.setNume("Ana");
        person.setPrenume("Mikhail");
        person.setEmail("mikhail@gmail.com");
        person.setUserID("ana.mikhail");
        person.setPassword("P@rola033");

        Person person2 = new Person();
        person2.setNume("Popescu");
        person2.setPrenume("Andrei");
        person2.setEmail("andrei.popescu@yahoo.com");
        person2.setUserID("andrei.popescu");
        person2.setPassword("SeCur3!123");

        Person person3 = new Person();
        person3.setNume("Ionescu");
        person3.setPrenume("Maria");
        person3.setEmail("maria.ionescu@gmail.com");
        person3.setUserID("maria.ionescu");
        person3.setPassword("M@ria2024");

        Person person4 = new Person();
        person4.setNume("Dumitrescu");
        person4.setPrenume("Vlad");
        person4.setEmail("vlad.dumi@outlook.com");
        person4.setUserID("vlad.dumitrescu");
        person4.setPassword("Parola#Strong1");

        Person person5 = new Person();
        person5.setNume("Georgescu");
        person5.setPrenume("Elena");
        person5.setEmail("elena.geo@gmail.com");
        person5.setUserID("elena.georgescu");
        person5.setPassword("Elen@2025");

        Person person6 = new Person();
        person6.setNume("Stan");
        person6.setPrenume("Cristian");
        person6.setEmail("cristian.stan@mail.com");
        person6.setUserID("cristian.stan");
        person6.setPassword("St@nPass33");



        DB bazaDeDate = new DB();

        bazaDeDate.createUser(person, people);
        bazaDeDate.createUser(person2, people);
        bazaDeDate.createUser(person3, people);
        bazaDeDate.createUser(person4, people);
        bazaDeDate.createUser(person5, people);
        bazaDeDate.createUser(person6, people);

        bazaDeDate.deleteUser(person3, people);

        System.out.println("Introduceti username-ul: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Introduceti password-ul: ");
        String password = scanner.nextLine();

        bazaDeDate.login(username, password, people);


    }


}
