package org.example.lab5;

import java.util.Scanner;
public class ex4{
    public static void main( String[] args ){
        System.out.print( "Enter a number between 0 and 10: " );
        @SuppressWarnings("resource")
        int number = new Scanner( System.in ).nextInt();
//assert that the absolute value is >= 0 and less then 10 as internal //invariant
        assert ( number >= 0 && number <= 10 ) : "bad number: " +
                number;
//for false
        System.out.printf( "You entered %d\n", number );
    }
}