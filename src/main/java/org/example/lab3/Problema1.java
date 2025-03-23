package org.example.lab3;

//1. Scrieți o aplicație Java în care citiți o valoare întreagă. În cazul în care valoarea întreagă este cuprinsă
//între 1-12, să se afișeze luna corespunzătoare. Considerați cazul în care valoarea introdusă este un șir de
//caractere și, dacă aceasta corespunde unei luni din an, afișați valoarea numerică a lunii.

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar sau un string corespunzator unei luni: ");
        String luna = scanner.nextLine();

        if(verificare_luna_boolean(luna)){
            System.out.println("Luna aferenta: " + luna + " este " + verificare_luna_int(Integer.parseInt(luna)));
        } else {
            System.out.println("Luna aferenta: " + luna + " este " + verificare_luna_string(luna));
        }


    }

    public static String verificare_luna_int(int luna) {
        switch (luna) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Eraore, luna e mai mica decat 0 sau mai mare decat 12";
        }
    }

    public static int verificare_luna_string(String luna) {
        switch (luna) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                return 0;
        }
    }


    public static boolean verificare_luna_boolean(String luna) {
        try{
            Integer.parseInt(luna);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }



}

/**
 * /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58570:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab3.Problema1
 * Introduceti un numar sau un string corespunzator unei luni:
 * 1
 * Luna aferenta: 1 este January
 *
 * Process finished with exit code 0
 * */