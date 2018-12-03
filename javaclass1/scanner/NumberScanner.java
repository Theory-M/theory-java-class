package pl.learn.theory.javaclass1.scanner;

import java.util.Scanner;
import java.lang.*;

public class NumberScanner {
    public static void main(String[] args) {
        Scanner numberReader = new Scanner(System.in);

        int a = numberReader.nextInt();
        int b = numberReader.nextInt();
        int c = numberReader.nextInt();

        int max = findMax(a, b, c);
        System.out.println("Found max: " + max);



//        if (firstEntry > secondEntry && firstEntry > secondEntry) {
//            System.out.println(firstEntry);
//        }else if (secondEntry > firstEntry && secondEntry > thirdEntry){
//            System.out.println(secondEntry);
//        }else if (thirdEntry > firstEntry && thirdEntry > secondEntry){
//            System.out.println(thirdEntry);
//        }

    }
    public static int findMax(int d, int e, int f){
        int max = d;

        if (e > max){
            max = e;
        }
        if (f > max){
            max = f;
        }

        return max;
    }

}
