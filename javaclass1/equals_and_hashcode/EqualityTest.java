package pl.learn.theory.javaclass1.equals_and_hashcode;

import java.lang.reflect.Array;
import java.util.*;

public class EqualityTest {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("michal", "j", 33));
        people.add(new Person("tomek", "p", 23));
        people.add(new Person("michal", "j", 33));
        people.add(new Person("wiesiek", "k", 5));

        Person personToFind = new Person("michal", "j", 5);

        System.out.println("contains: " + people.contains(personToFind));

        Set<Person> personSet = new HashSet<>();
        //dodaje WSZYSTKIE elementy
        personSet.addAll(people);

        // set NIE duplikuje elementow
        System.out.println("Set size: " + personSet.size());

        // iterowanie po Set'cie, czyli przejscie po elementach i wypisze w sposob NIEUPORZADKOWANY
        for (Person p : personSet){
            System.out.println("Person: " + p);
        }

        //jesli chce miec w kolejnosci to LinkeHashSet:
        Set<Person> anotherSet = new LinkedHashSet<>();

        List<Person> personList = new LinkedList<>();

    }
}
