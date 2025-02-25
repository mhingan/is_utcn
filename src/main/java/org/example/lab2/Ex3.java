package org.example.lab2;

//3. Scrieți o aplicație Java în care citiți de la tastatura un număr întreg și afișați toți divizorii numărului
//respectiv

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un int: ");

        int a = scanner.nextInt();
        System.out.println("Numarul introdus este: " + a);

        divizor(a);

    }

    public static void divizor(int a) {
        System.out.println("Divizorii lui " + a + " sunt: ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }
}


/** OUTPUT
 /Users/mihaita.hingan/Library/Java/JavaVirtualMachines/openjdk-23.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=52150:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/mihaita.hingan/IdeaProjects/is_utcn/target/classes org.example.lab2.Ex3
 Introduceti un int:
 30
 Numarul introdus este: 30
 Divizorii lui 30 sunt:
 1
 2
 3
 5
 6
 10
 15
 30

 Process finished with exit code 0
 * */
