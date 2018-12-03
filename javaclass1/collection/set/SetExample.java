package pl.learn.theory.javaclass1.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("one");

        // NIE MA duplikatow, wiec wypisze dwa, mimo ze podalem trzy, bo dwa sa takie same
        System.out.println("Size: " + stringSet.size());
    }
}
