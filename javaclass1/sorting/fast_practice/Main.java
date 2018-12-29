package pl.learn.theory.javaclass1.sorting.fast_practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<LaundryPiece> myLaundry = new ArrayList<>(Arrays.asList(
                new LaundryPiece("shirt", true, true, 0.3),
                new LaundryPiece("pants", false, true, 0.2),
                new LaundryPiece("sweater", true, false, 0.5),
                new LaundryPiece("hat", false, false, 0.1)));

        myLaundry.sort((o1, o2) -> (int) (o1.getWeight()-o2.getWeight()));
        // alfabetycznie to musze compareTo
        myLaundry.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        //w odwrotnej kolejnosci -- uzywam reverse:
        myLaundry.sort(Comparator.comparing(LaundryPiece::getName).reversed());

        // moge tez sortowac najpierw po X, a potem po Y:
        myLaundry.sort(Comparator.comparing(LaundryPiece::getName).thenComparing((o1, o2) -> (int) (o1.getWeight()-o2.getWeight())));
        // i tak sort, then sort more
        myLaundry.sort(Comparator.comparing(LaundryPiece::getName).thenComparing(LaundryPiece::getWeight));
        // albo:
        myLaundry.sort(Comparator.comparing(LaundryPiece::getName).reversed().thenComparing(LaundryPiece::getWeight));
        System.out.println(myLaundry);
        // sortowanie booleanow -- Comparator zna sie na tym, ale musze go przywolac
        myLaundry.sort(Comparator.comparing(LaundryPiece::isClean));

    }
}
