package org.example.lab8.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ex2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("date.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(" ");

            try{
                int year = Integer.parseInt(data[0]);
                String luna = data[1];
                int an = Integer.parseInt(data[2]);

                System.out.println(year + "\n" + luna + "\n" + an + "\n");

            } catch (Exception e){
                System.out.println("Eroare convertire: " + e.getMessage());
            }
        }

    }
}
