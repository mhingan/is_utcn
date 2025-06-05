package org.example.lab7.ex5;

import java.util.Comparator;

public class CompareStudents implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // Comparam dupa nume (crescator)
        int nameCompare = s1.getName().compareTo(s2.getName());

        if (nameCompare != 0) {
            return nameCompare; // Daca numele sunt diferite
        } else {
            // Daca numele sunt la fel, comparam dupa medie (descrescator)
            if (s1.getMedia() > s2.getMedia()) {
                return -1;
            } else if (s1.getMedia() < s2.getMedia()) {
                return 1;
            } else {
                return 0;
            }
        }
    }


}
