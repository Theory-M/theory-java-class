package pl.learn.theory.javaclass1.switch_test;

import pl.learn.theory.javaclass1.enum_example.Months;

public class SwitchTest {

    public static void main(String[] args) {

        final int a = 5;
        // jak mam final to nie moge potem zmienic wartosci a:
//        a = 5; NIE
        // nawet jak mam metode do zmiany a, to nie zmienie tej finalnej wartosci a
        ChangeInt(a);
        System.out.println("a after method call: " + a);

        // w przypadku obiektu pieczetuje referencje, czyli moge modyfikowac obiekt, ale nie moge przestawic referencji
        final StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append(2);
        builder.reverse();
        // builder = new StringBuilder(); NIE

        //wywoluje metode na ENUMach do wypisania liczby dni w miesiacy na podstawie SWITCHa
        printNumberOfDaysInMonth(Months.MARCH);

    }

    // metoda do zmieniania wartosci a
    public static void ChangeInt (int a){
        a = 6;
        System.out.println("a inside method: " + a);
    }
    // metoda na dawanie nagrody za ocene
    public static void checkMark(int mark){
        if(mark == 6 || mark == 5){
            System.out.println("Great!!!");
        } else if (mark == 4 && mark >= 3){
            System.out.println(" good job");
        } else {
            System.out.println("wrrr");
        }
    }

    public static void checkMarkWithSwitch(int mark){
        switch (mark){
            case 6:
            case 5:
                System.out.println("Great");
                break;
            case 4:
            case 3:
                System.out.println("good");
                break;
                // default wylapie tez 99, mimo ze oceniam tylko do 6
            default:
                System.out.println("wrrr");
        }
    }

    //wypisywanie dni w miesiacu
    public static void printNumberOfDaysInMonth (Months currentMonth){
        // switxh dziala na ENUMie
        switch (currentMonth){
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("31");
                break;
            case FEBRUARY:
                System.out.println("28");
                break;
            default:
                System.out.println("30");
        }
    }
    public static void switchStringTest (String string){
        switch (string){
            case "a":
            case "b":
                System.out.println("starczy");
                break;
            case "c":
            case "d":
                System.out.println("costam");
                break;
            default:
                    System.out.println("reszta");
        }
    }

}
