package pl.learn.theory.javaclass1.calculatorTests.calculator;

import java.util.Scanner;
import java.lang.*;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Input your desired operation using +, -, *, /:");

        float firstValue = inputReader.nextFloat();
        String operation = inputReader.next();
        float secondValue = inputReader.nextFloat();


        if (operation.equals("+")) {
            System.out.println("= "); System.out.println(firstValue + secondValue);
        } else if (operation.equals("x") || operation.equals("*")) {
            System.out.println("= "); System.out.println(firstValue * secondValue);
        } else if (operation.equals("-")) {
            System.out.println("= "); System.out.println(firstValue - secondValue);
        } else if (operation.equals("/")) {
            System.out.println("= "); System.out.println(firstValue / secondValue);
        } else {
            System.out.println("I don't understand: " + operation);
        }


//        System.out.println("Do you want to continue counting <Y/N>");
//        char continueYesNo = inputReader.next().charAt(0);

    }

}


