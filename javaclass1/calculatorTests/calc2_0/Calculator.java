package pl.learn.theory.javaclass1.calculatorTests.calc2_0;

import java.util.Scanner;

import static pl.learn.theory.javaclass1.calculatorTests.calc2_0.Operation.calculate;

public class Calculator {
    public static void main(String[] args) {

        String question = "";

        do {
            System.out.println("begin calculations");
            Scanner sc = new Scanner(System.in);

            //pierwsza liczba
            while (!sc.hasNextLong()) {
                System.out.println("That's not a valid number");
                sc.next();
            }
            long c = sc.nextLong();

            //operator dzialania
            while (!sc.hasNext("[+-/*x]")) {
                System.out.println("That's not a valid operator");
                sc.next();
            }
            String operator = sc.next();

            //druga liczba
            while (!sc.hasNextLong()) {
                System.out.println("That's not a valid number");
                sc.next();
            }
            long d = sc.nextLong();


            if (operator.equals("+")) {
                System.out.println(calculate(new Addition(), c, d));
            } else if (operator.equals("-")) {
                System.out.println(calculate(new Substraction(), c, d));
            } else if (operator.equals("/")) {
                System.out.println(calculate(new Division(), c, d));
            } else {
                System.out.println(calculate(new Multiplication(), c, d));
            }
            System.out.println("Do you want to continue <Y/N>?");
            question = sc.next();
        }while (question.equalsIgnoreCase("y"));
        System.out.println("come again later!");
    }
}

//      to dziala, ale nie do konca -- najpierw wykonuje dzialanie, potem pyta y/n,
//      mozna od razu wprowadzac liczby, albo napisac n
//      na cyfry -- wykonuje dzialanie
//      na n -- konczy zadanie
//
//        while (!sc.hasNext("[nN]")) {
//
//            //pierwsza liczba
//            while (!sc.hasNextLong()) {
//                System.out.println("That's not a valid number");
//                sc.next();
//            }
//            long c = sc.nextLong();
//
//            //operator dzialania
//            while (!sc.hasNext("[+-/*x]")) {
//                System.out.println("That's not a valid operator");
//                sc.next();
//            }
//            String operator = sc.next();
//
//            //druga liczba
//            while (!sc.hasNextLong()) {
//                System.out.println("That's not a valid number");
//                sc.next();
//            }
//            long d = sc.nextLong();
//
//
//            if (operator.equals("+")) {
//                System.out.println(calculate(new Addition(), c, d));
//            } else if (operator.equals("-")) {
//                System.out.println(calculate(new Substraction(), c, d));
//            } else if (operator.equals("/")) {
//                System.out.println(calculate(new Division(), c, d));
//            } else {
//                System.out.println(calculate(new Multiplication(), c, d));
//            }
//            System.out.println("Do you want to continue <Y/N>?");

//        System.out.println("Do you want to continue <Y/N>?");
//        while (!sc.hasNext("[yYnN]")){
//            System.out.println("That's not a valid operator");
//            sc.next();
//        }
//        String shouldIContinue = sc.next();

