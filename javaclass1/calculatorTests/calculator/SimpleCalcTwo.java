package pl.learn.theory.javaclass1.calculatorTests.calculator;

import java.util.Scanner;
import java.lang.*;

public class SimpleCalcTwo {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);


        double firstValue = inputReader.nextDouble();
        double secondValue = inputReader.nextDouble();
        String operation = inputReader.next();
        boolean isNumber;
        boolean isOperation;

//        float firstValue = inputReader.nextFloat();
//        String operation = inputReader.next();
//        float secondValue = inputReader.nextFloat();



        do {
            System.out.println("Input your desired operation using +, -, *, /:");
            if (inputReader.hasNextDouble()) {
                firstValue = inputReader.nextDouble();
                isNumber = true;
            } else {
                System.out.println("Please insert a valid integer");
                isNumber = false;
                inputReader.next();
            }
        } while (!(isNumber));
        System.out.println(firstValue);
            do {
                if (inputReader.hasNextDouble()) {
                    secondValue = inputReader.nextDouble();
                    isNumber = true;
                }else{
                    System.out.println("Please instert a valid integer");
                    isNumber = false;
                    inputReader.next();
                }
            } while (!(isNumber));
            System.out.println(secondValue);
        do {
            if (operation.equals("+")) {
                System.out.println("= ");
                isOperation = true;
                System.out.println(firstValue + secondValue);

            }else if (operation.equals("-")) {
                System.out.println("= ");
                isOperation = true;
                System.out.println(firstValue - secondValue);

            }else if (operation.equals("x") || operation.equals("*")) {
                System.out.println("= ");
                isOperation = true;
                System.out.println(firstValue * secondValue);

            }else if (operation.equals("/")) {
                System.out.println("= ");
                isOperation = true;
                System.out.println(firstValue / secondValue);

            }else {
                System.out.println("I don't understand: " + operation);
                isOperation = false;
            }
        } while (!(isOperation));
        System.out.println(operation);


//
//        }
//
//
//        if (operation.equals("+")) {
//            System.out.println("= "); System.out.println(firstValue + secondValue);
//        } else if (operation.equals("x") || operation.equals("*")) {
//            System.out.println("= "); System.out.println(firstValue * secondValue);
//        } else if (operation.equals("-")) {
//            System.out.println("= "); System.out.println(firstValue - secondValue);
//        } else if (operation.equals("/")) {
//            System.out.println("= "); System.out.println(firstValue / secondValue);
//        } else {
//            System.out.println("I don't understand: " + operation);
//        }
//
//
////        System.out.println("Do you want to continue counting <Y/N>");
////        char continueYesNo = inputReader.next().charAt(0);

    }

}


