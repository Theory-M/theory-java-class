package pl.learn.theory.javaclass1.data_type;

import java.sql.SQLOutput;

public class DataTypes {

    public static void main(String[] args) {
        int a = 5 + 8; // 4 bajty

        // powyzszy sposob uzywa 4 razy mniej zasobow niz ponizszy, uzywa sie tez tego mniejszego ze wzgledow kobatybilnosci
        Integer anInteger = 5 + 8; // skrot dla: new Integer (5 + 8);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Min int: " + Integer.MIN_VALUE);

        // mozna chciec operowac na wiekszch liczbach

        long b = 5 + 8; // 8 bajtow
        //male lub duze L oznacza ze nie jest to zwykly integer
        Long bLong = 5L + 8L;
        System.out.println("New max long: " + Long.MAX_VALUE);
        System.out.println("New nim long: " + Long.MIN_VALUE);

        short c = 0; // 5 + 8
        Short cShort = 0;
        System.out.println("Min short:: " + Short.MIN_VALUE);
        System.out.println("Max short:: " + Short.MAX_VALUE);

        byte d = (byte) 128130; // 128 jednak juz nie miesci sie w zakresie, wiec Javie nie podpasuje
        Byte dByte = 0;
        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("Max byte: " + Short.MAX_VALUE);

        // 4 bajty do z przecinkami
        float e = 3.11f;
        Float eFloat = 3.11f;
        System.out.println("Min float: " + Float.MIN_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);

        // 8 bajtow z przecinkami
        double db = 2.11;
        Double dbDouble = 2.11;
        System.out.println("Min double: " + Double.MIN_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);

        boolean trueOrFalse = false;
        trueOrFalse = true;

        // typ obiektowy trojwatosciowy
        Boolean bBoolean = true;
        bBoolean = false;
        bBoolean = null;

        // do przechowywania znakow
        char littleChar = '.';
        Character lCharacter = 'd';
        System.out.println("Min character: " + (int) Character.MIN_VALUE);
        System.out.println("Max character: " + (int) Character.MAX_VALUE);
    }
}
