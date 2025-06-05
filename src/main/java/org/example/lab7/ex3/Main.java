package org.example.lab7.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Copil> copii = new ArrayList<>();
        List<Adult> adulti = new ArrayList<>();
        List<Pensionar> pensionari = new ArrayList<>();

        System.out.println("Introduceti numarul de copii: ");
        Scanner scanner = new Scanner(System.in);
        int nr_copii = scanner.nextInt();

        for(int i = 0; i < nr_copii; i++){

            try{
                System.out.println("Introduceti numele: ");
                String nume = scanner.next();
                System.out.println("Introduceti varsta: ");
                int varsta = scanner.nextInt();
                copii.add(new Copil(nume, varsta));
            } catch (Exception e) {
                System.out.println("Eroare la creare copil: \n\t" + e.getMessage() + "\n");
            }


        }


        System.out.println("Introduceti numarul de adulti: ");
        int nr_adulti = scanner.nextInt();

        for(int i = 0; i < nr_adulti; i++){
            try{
                System.out.println("Introduceti numele: ");
                String nume = scanner.next();
                System.out.println("Introduceti varsta: ");
                int varsta = scanner.nextInt();
                adulti.add(new Adult(nume, varsta));
            } catch (Exception e) {
                System.out.println("Eroare la creare adult: \n\t" + e.getMessage() + "\n");
            }
        }


        System.out.println("Introduceti numarul de adulti: ");
        int nr_pensionari = scanner.nextInt();

        for(int i = 0; i < nr_pensionari; i++){
            try{
                System.out.println("Introduceti numele: ");
                String nume = scanner.next();
                System.out.println("Introduceti varsta: ");
                int varsta = scanner.nextInt();
                pensionari.add(new Pensionar(nume, varsta));
            } catch (Exception e) {
                System.out.println("Eroare la creare pensionar: \n\t" + e.getMessage() + "\n");
            }
        }




        //afisare liste
        if(!copii.isEmpty()){
            System.out.println("Lista de copii: ");
            for(Copil copil : copii){
                System.out.println(copil);
            }
        }

        if(!adulti.isEmpty()){
            System.out.println("Lista de adulti: ");
            for(Adult adult : adulti){
                System.out.println(adult);
            }
        }

        if(!pensionari.isEmpty()){
            System.out.println("Lista de pensionari: ");
            for(Pensionar pensionar : pensionari){
                System.out.println(pensionar);
            }
        }


    }



}
