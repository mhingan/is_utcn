package org.example.lab7.ex5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //SortedSet care sorteaxa lista by default cu ajutorul compaaratorului CompareStudents
        SortedSet<Student> students = new TreeSet<>(new CompareStudents());

        System.out.println("Introductei numarul de elevi: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //citire date studenti
        for(int i = 0; i < num; i++) {
            String nume;
            int grupa;
            double media;

            System.out.println("Nume student: ");
            nume = scanner.next();
            System.out.println("Grupa student: ");
            grupa = scanner.nextInt();
            System.out.println("Media student: ");
            media = scanner.nextDouble();

            if(!nume.isEmpty() && grupa >0 && media > 0 && media <= 10) {
                students.add(new Student(nume, grupa, media));
                System.out.println("Student adaugat cu succes.");
            } else {
                System.out.println("Studentul nu a fost adaugat.");
            }
        }

        //afisare date studenti - cu for
        for(Student student : students){
            System.out.println(student);
        }



        //parcurgere lista cu Iterator
        Iterator<Student> iterator = students.iterator();
        System.out.println("Studenti cu media >= 8: ");

        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getMedia() >= 8){
                System.out.println(student);
            }
        }

    }
}
