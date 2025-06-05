package org.example.lab8.ex6;

public class Person {
    String firstName;
    String lastName;
    String phoneNumber;
    String dateOfBirth;
    String linkToFB;

    public Person(String firstName, String lastName, String phoneNumber, String dateOfBirth, String linkToFB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.linkToFB = linkToFB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLinkToFB() {
        return linkToFB;
    }

    public void setLinkToFB(String linkToFB) {
        this.linkToFB = linkToFB;
    }
}
