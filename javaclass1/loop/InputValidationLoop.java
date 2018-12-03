package pl.learn.theory.javaclass1.loop;

import java.util.Scanner;
import java.lang.*;

public class InputValidationLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a vowel, lowercase!");
        while (!sc.hasNext("[aeiou]")) {
            System.out.println("That's not a vowel!");
            sc.next();
        }
        String vowel = sc.next();
        System.out.println("Thank you! Got " + vowel);

        //minimalist way
        System.out.print("Please enter an integer: ");
        while(!sc.hasNextInt()) sc.next();
        int demoInt = sc.nextInt();
    }

}
//    public static void main(String[] args) {
//
//        Scanner inputReader = new Scanner(System.in);
//
//
//        double firstValue = inputReader.nextDouble();
//
////        double secondValue = inputReader.nextDouble();
////        String operation = inputReader.next();
//        boolean isNumber;
//        boolean isOperation;
//
//
//
//
//        do {
//            System.out.println("Input your desired operation using +, -, *, /:");
//            if (inputReader.hasNextDouble()) {
////                firstValue = inputReader.nextDouble();
//                isNumber = true;
//            } else {
//                System.out.println("Please insert a valid integer");
//                isNumber = false;
//                inputReader.next();
//            }
//        } while (!(isNumber));
//        System.out.println(firstValue);
//        do {
//            if (inputReader.hasNextDouble()) {
//                secondValue = inputReader.nextDouble();
//                isNumber = true;
//            }else{
//                System.out.println("Please instert a valid integer");
//                isNumber = false;
//                inputReader.next();
//            }
//        } while (!(isNumber));
//        System.out.println(secondValue);
//        do {
//            if (operation.equals("+")) {
//                System.out.println("= ");
//                isOperation = true;
//                System.out.println(firstValue + secondValue);
//
//            }else if (operation.equals("-")) {
//                System.out.println("= ");
//                isOperation = true;
//                System.out.println(firstValue - secondValue);
//
//            }else if (operation.equals("x") || operation.equals("*")) {
//                System.out.println("= ");
//                isOperation = true;
//                System.out.println(firstValue * secondValue);
//
//            }else if (operation.equals("/")) {
//                System.out.println("= ");
//                isOperation = true;
//                System.out.println(firstValue / secondValue);
//
//            }else {
//                System.out.println("I don't understand: " + operation);
//                isOperation = false;
//            }
//        } while (!(isOperation));
//        System.out.println(operation);
//
//    }
//
//}
//
//
