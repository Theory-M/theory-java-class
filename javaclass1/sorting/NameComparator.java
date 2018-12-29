package pl.learn.theory.javaclass1.sorting;

public class NameComparator {

    public static int comparePersonsByName (Person first, Person second){
        return first.getName().compareTo(second.getName());
    }
}
