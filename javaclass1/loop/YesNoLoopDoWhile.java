package pl.learn.theory.javaclass1.loop;

import java.util.Scanner;

public class YesNoLoopDoWhile {


    public static void main(String[] args) {

        String y = "";

        do {
            System.out.println("beginning");
            // CREATE SCANNER
            Scanner input = new Scanner(System.in);
            System.out.print("what do you want to do: S or C?");
            String a = input.next();
            // s or c
            if (a.equals("C")) {
                System.out.print("Thank you.  What is the radius of the circle (in inches): ");
                Double c = input.nextDouble();
                System.out.printf("The area of a circle with a radius of " + "is " + (3.14 * c * c) + " cubic inches");
            } else if (a.equals("S")) {
                System.out.print("Thank you.  What is the radius of the sphere (in inches):  ");
                Double s = input.nextDouble();

                System.out.printf("The volume of a sphere with a radius of" + s + "is " + (4 * 22 * s * s * s) / (3 * 7)
                        + " cubic inches");

            }
            // yes or no
            System.out.print("Do you want to calculate another round object (Y/N)? ");
            y = input.next();
        } while (y.equalsIgnoreCase("Y"));

        System.out.println("Thnk you");
    }
}
//    public static void main(String[] args) {
//        Scanner text = new Scanner(System.in);
//
//        input = JOptionPane.showInputDialog("Do you have more grades to input? Please type 'Yes' or 'No'.");
//        String input;
//        int grade;
//
//        do {
//            input = JOptionPane.showInputDialog("Enter the midterm grades, please");
//            grade = Integer.parseInt(input);
//
//            if ( grade < 0 || grade > 100 ) {
//                input = JOptionPane.showInputDialog("You have entered an invalid grade. The grade should be a number between 0 and 100. Enter the midterm grades, please.");
//                grade = Integer.parseInt(input);
//            }
//
//            input = JOptionPane.showInputDialog("Do you have more grades to input? Please type 'Yes' or 'No'.");
//
//            while ( (!input.equals("Yes")) && (!input.equals("No")) ) {
//                input = JOptionPane.showInputDialog("You should type 'Yes' if you want to input more grades or 'No' if you are done with inputing grades. Do you have more grades to input? Please type 'Yes' or 'No'.");
//
//                if ( (input.equals("Yes")) || (input.equals("No")) ) {
//                    break;
//                } else {
//                    continue;
//                }
//            }
//
//        } while ( input.equals("Yes") );
//    }
//
//}
