package pl.learn.theory.javaclass1.sorting;

import java.util.Comparator;

public class ShoeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {

        // mam shoeSize zapisane jako double, wiec musze cast to int
        return (int) (o1.getShoeSize()-o2.getShoeSize());
    }
}
