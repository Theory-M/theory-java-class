package pl.learn.theory.javaclass1.scanner;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        int a = numberReader.nextInt();
        int b = numberReader.nextInt();
        int c = numberReader.nextInt();
        int d = numberReader.nextInt();

        int min = findMin(a,b,c,d);
        System.out.println("Found minimum: " + min);
    }
    public static int findMin (int e, int f, int g, int h){
        int min = e;
        if (f < min){
            min = f;
        }if (g < min){
            min = g;
        }if (h < min){
            min = h;
        }
        return min;
    }
}
