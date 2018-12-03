package pl.learn.theory.javaclass1.scanner;

import java.util.Scanner;

public class FinMaxAlt {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        int a = numberReader.nextInt();
        int b = numberReader.nextInt();
        int c = numberReader.nextInt();





        if (a > b && a > c) {
            System.out.println(a);
        }else if (b > a && b > c){
            System.out.println(b);
        }else if (c > a && c > b){
            System.out.println(c);
        }

    }
}

