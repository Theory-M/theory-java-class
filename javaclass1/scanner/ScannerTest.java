package pl.learn.theory.javaclass1.scanner;

import java.util.Scanner;
import java.lang.*;

public class ScannerTest {
    public static void main(String[] args) {
        // zeby moc uzywac Scanner to MUSZE zaimportowac java.util.Scanner
        Scanner inputReader = new Scanner(System.in);

        //zeby zachecic uzytkownika warto mu dac polecenie
        System.out.println("Enter numbers here, I will multiply them for you:");
        int intValue = inputReader.nextInt();
        int secondValue = inputReader.nextInt();
        int thirdValue = inputReader.nextInt();

//        System.out.println("I got these values: " + intValue + " and " + secondValue);

        System.out.println(intValue + " * " + secondValue + " * " + thirdValue + " =");

        System.out.println(intValue / secondValue / thirdValue);

        //a tak bedzie czytal tylko cyfry dopoki ma cyfry do czytania
        for (; inputReader.hasNext();) {
            if (inputReader.hasNextInt()) {
                System.out.println(inputReader.next());
            } else {
                inputReader.next();
            }
        }


    }
}
