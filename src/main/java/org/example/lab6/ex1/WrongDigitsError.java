package org.example.lab6.ex1;

public class WrongDigitsError extends ArrayIndexOutOfBoundsException {
    public WrongDigitsError(String message) {
        super(message);
    }
}
