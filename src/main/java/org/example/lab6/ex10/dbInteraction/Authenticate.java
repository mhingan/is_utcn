package org.example.lab6.ex10.dbInteraction;

import java.util.List;

public interface Authenticate {

     boolean createUser(Person user, List<Person> people);
     boolean deleteUser(Person user, List<Person> people);
     boolean login(String userID, String password, List<Person> people);

}
