package org.example.lab8.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date;

        while (true) {
            System.out.println("Introduceti data sub formatul: DD/MM/YYYY");
            date = reader.readLine();

            //verific daca dam intorids X sau x
            if (date.equalsIgnoreCase("x")) {
                System.out.println("Program oprit.");
                break; // ieși din while
            }

            System.out.println(verificaData(date));
        }

        System.out.println("Programul a fost inchis cu succes.");


    }


    public static String verificaData(String date) {
        String[] dataArray = date.split("/");

        String zi = dataArray[0];
        String luna = dataArray[1];
        String an = dataArray[2];

        switch (luna) {
            case "1":
            case "01":
                return zi + " January " + an;
            case "2":
            case "02":
                return zi + " February " + an;
            case "3":
            case "03":
                return zi + " March " + an;
            case "4":
            case "04":
                return zi + " April " + an;
            case "5":
            case "05":
                return zi + " May " + an;
            case "6":
            case "06":
                return zi + " June " + an;
            case "7":
            case "07":
                return zi + " July " + an;
            case "8":
            case "08":
                return zi + " August " + an;
            case "9":
            case "09":
                return zi + " September " + an;
            case "10":
                return zi + " October " + an;
            case "11":
                return zi + " November " + an;
            case "12":
                return zi + "December" + an;
            default:
                return "Error";
        }

    }
}
