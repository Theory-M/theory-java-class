package pl.learn.theory.javaclass1.sorting;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("a", "Aaa", 12, 99, 0, 1.3, 35),
            new Person("b", "Bbb", 22, 89, 600, 1.5, 39),
            new Person("c", "Ccc", 32, 129, 200, 1.6, 38),
            new Person("d", "Ddd", 42, 119, 300, 1.7, 41),
            new Person("e", "Eee", 52, 139, 400, 1.8, 45)));

        // chce posortowac : wiec tworze sortowanie
        Collections.sort(persons);
        // i wypisuje posortowane
        System.out.println(persons);

        // sortowań moge robic dowolne ilosci, skoro mam ShoeComparator, to robie sort z Comparatorem
        Collections.sort(persons, new ShoeComparator());
        System.out.println(persons);

        Collections.sort(persons, new IncomeComparator());
        System.out.println(persons);

        // ale moge tez porownywac W MIEJSCU bez implementowania itp bez robienia Comparatora
        Collections.sort(persons, ((o1, o2) -> (int) (o1.getHeight()-o2.getHeight())));
        Collections.sort(persons, ((o1, o2) -> (int) (o2.getShoeSize()- o1.getShoeSize())));

        // moge tez tak napisac, troche dluzej
        Collections.sort(persons, (first, second) -> first.getName().compareTo(second.getName()));
        // jesli chce zeby bylo czytelniej, to moge stworzyc klase porownujaca i zapisac tak
        Collections.sort(persons, NameComparator::comparePersonsByName);

        // tak tez mozna... za pomoca fabrycznego Comparatora ktory ma tez reverseOf
        Collections.sort(persons, Comparator.comparing(person -> person.getName()));
        // jeszcze krocej (w wersji 8+)
        persons.sort(NameComparator::comparePersonsByName);



//        persons.sort((o1, o2) -> );
    }

}

