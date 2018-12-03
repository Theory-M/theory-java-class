package pl.learn.theory.javaclass1.conditional;

public class ConditionsTest {

    public static void main(String[] args) {
//        int age = 2; // wartosc poczatkowa
        printStringLength("ala");
        String value = "ala ma kota";
        printStringLength(value);
        printStringLength(null);

        testStringLength(null);
        testStringLength("");
    }

//        if (age < 18)
//            System.out.println("aha");
//            System.out.println("if???"); Zapisane w ten sposob (bez klamry) wykona tylko pierwsza linijke pod if, wiec po prostu sie wyswietli wiec:


//        if (age < 18) {
////            System.out.println("You must be 18 to enter");
////        }
////        if (age >=18) {
////            System.out.println("Age is OK"); ale lepiej wykonac przez ELSE
//
////        if (age < 18) {
////            System.out.println("You must be 18 to enter");
////        }
////        else {
////            System.out.println("Age is OK");
////        }

//            if (age ) {
//                System.out.println("ago Ok");
//            }
//         public static void testAge(int age)
//
//             if (age <=11) {
//                 System.out.println("Too young");
//             } else if (age <=15) {
//                 System.out.println("almost");
//             } else if (age <=18) {
//                 System.out.println("age OK");
//             }
//        }

    public static void printStringLength(String string) {
        if (string !=null) {
            int stringLen = string.length();
            System.out.println("strng length: " + stringLen);
        } else {
            System.out.println("null is not allowed here");
        }

    }

    public static void testStringLength(String string) {
        if (null != string && string.length() < 10) {
            System.out.println("String is quite short");
        }

    }

}

