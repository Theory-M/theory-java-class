package pl.learn.theory.javaclass1.calculatorTests.calcCopyPractice;

import java.util.Scanner;

import static pl.learn.theory.javaclass1.calculatorTests.calcCopyPractice.Operation.calculate;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

//        Operation aa = new Addition();
//
//        System.out.println(aa.perform(2,2));
//        aa.perform(2,2);

        Operation aa = new Addition();
        System.out.println(aa.perform(a,b));

        System.out.println(calculate (new Addition(), a, b));

    }
}
