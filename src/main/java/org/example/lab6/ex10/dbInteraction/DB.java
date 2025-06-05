package org.example.lab6.ex10.dbInteraction;

import java.util.List;

public class DB implements Authenticate {

    VerifyPerson verifyPerson;

    @Override
    public boolean createUser(Person user, List<Person> people) {
        try {
//            verifyPerson.verifyNumeForSymbols(user.getNume());
//            verifyPerson.verifyPrenumeForSymbols(user.getPrenume());
//            verifyPerson.verifyEmail(user.getEmail());
//            verifyPerson.verifyUserID(user.getUserID());
//            verifyPerson.verifyPassword(user.getPassword());
            people.add(user);
            return true;
        } catch (Exception e) {
            System.out.println("Eroare creare user: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteUser(Person user, List<Person> people) {
        try {
            for (Person person : people) {
                if (person.equals(user)) {
                    people.remove(person);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Eroare stergere user: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean login(String userID, String password, List<Person> people) {
        for (Person person : people) {
            if (person.getUserID().equals(userID)) {
                if (person.getPassword().equals(password)) {
                    System.out.println("Login OK");
                    return true;
                }
            }
        }
        return false;
    }
}
