package pl.learn.theory.javaclass1.excercise;

import java.util.Arrays;

public class ArrayExcercise {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        Integer[] arrayOfIntegers = {1,2,3};

        // albo tak:
//        Integer[] arrayOfIntegers = new Integer[3];
//        arrayOfIntegers[0]=1;
//        arrayOfIntegers[1]=2;
//        arrayOfIntegers[2]=3;

        /// rzutowanie na obiekty
        Object[] objects = arrayOfIntegers;
        System.out.println(objects.length);

        Object o = array;

        System.out.println(array.equals(array));

        System.out.println("\nhashCode():");
        System.out.println(array.toString());

        System.out.println("\ntoHexString():");
        System.out.println(Integer.toHexString(array.hashCode()));

        System.out.println();

        Anonymous a = new Anonymous();
        System.out.println(a.toString());
    }
}
class Anonymous {

}