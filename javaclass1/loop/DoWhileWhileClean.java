package pl.learn.theory.javaclass1.loop;

import java.util.Scanner;

public class DoWhileWhileClean {


    public static void main(String[] args) {

        String y = "";

        do {
            System.out.println("beginning");
            // CREATE SCANNER
            Scanner sc = new Scanner(System.in);
            System.out.println("choose between X and Z");
            String a = sc.next();

            // X or Z
            if (a.equalsIgnoreCase("X")){
                System.out.println("you chose X");
            }else if (a.equalsIgnoreCase("Z")){
                System.out.println("you chose Z");
            }
            System.out.println("do you wish to continue? <Y/N>");
            y = sc.next();
        }while (y.equalsIgnoreCase("y"));
        System.out.println("finished");
    }

}
