package org.example.lab6.ex10.dbInteraction;

public abstract class VerifyPerson extends Person {

    public void verifyNumeForSymbols(String name) {
        try {
            if (name.matches("[a-zA-Z]+]") && name.length() < 50) {
                super.setNume(name);
            }
        } catch (Exception e) {
            System.out.println("Eroare la setarea numelui: " + e.getMessage());
        }
    }


    public void verifyPrenumeForSymbols(String prenume) {
        try {
            if (prenume.matches("[a-zA-Z]+]") && prenume.length() < 50) {
                super.setPrenume(prenume);
            }
        } catch (Exception e) {
            System.out.println("Eroare la setarea prenumelui: " + e.getMessage());
        }
    }

    public void verifyEmail(String email) {
        try{
            if (email.matches("[a-zA-Z._]@[a-zA-Z.].[a-zA-Z]")) {
                super.setEmail(email);
            }
        } catch (Exception e) {
            System.out.println("Eroare la setarea emailului: " + e.getMessage());
        }
    }

    public abstract boolean verifyUserID(String Id);
    public abstract boolean verifyPassword(String password);



}
