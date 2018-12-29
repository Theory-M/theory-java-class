package pl.learn.theory.javaclass1.sorting;

import java.util.Comparator;

public class IncomeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // od najwiekszego do najmniejszego
        return (int) (o2.getIncome()-o1.getIncome());
    }
}
