package org.example.lab6.ex10.dbInteraction;

public class Verify extends VerifyPerson {

    @Override
    public boolean verifyUserID(String userID) {
        try {
            if (userID.matches("[a-zA-Z0-9]*]")) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Invalid User ID: " + e.getMessage());
        }
        return false;

    }

    @Override
    public boolean verifyPassword(String password) {
        try {
            if ((password.length() > 8) && password.contains("[^a-zA-Z0-9]") && password.contains("[A-Z]")){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }

        return false;
    }
}
