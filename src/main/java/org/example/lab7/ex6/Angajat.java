package org.example.lab7.ex6;


public class Angajat implements Comparable<Angajat> {
    private String name;
    private int age;
    private double salary;

    public Angajat(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }

    @Override
    public int compareTo(Angajat other) {
        // Crescator dupa nume
        int nameCompare = this.name.compareTo(other.name);

        if (nameCompare != 0) {
            return nameCompare;
        } else {
            // Daca numele sunt egale, sortam descrescator dupa varsta
            return other.age - this.age;
        }
    }

}
