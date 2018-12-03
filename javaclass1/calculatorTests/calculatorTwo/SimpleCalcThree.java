package pl.learn.theory.javaclass1.calculatorTests.calculatorTwo;

import java.util.Scanner;
import java.lang.*;

public class SimpleCalcThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float firstValue = 0;
        boolean isNumber;

        System.out.println("Enter a number here: ");

        do {
            if (input.hasNextFloat()) {
                firstValue = input.nextFloat();
                isNumber = true;
            }else{
                System.out.println("I don't understand you");
                isNumber = false;
            }
        } while (!(isNumber));
        System.out.println(firstValue);
    }
}
