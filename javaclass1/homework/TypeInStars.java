package pl.learn.theory.javaclass1.homework;

import java.util.Scanner;

public class TypeInStars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String typeHere = input.next();

        String a = "99\n55";

        System.out.println(a);


//        if (typeHere.equals("a") || typeHere.equals("A")) {
        if (input.hasNext()) {
            System.out.println(" *** \n*   *\n*   *\n*   *\n*****\n*   *\n*   *\n*   *");
        }

    }
}
