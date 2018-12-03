package pl.learn.theory.javaclass1.generic;

import pl.com.mpas.warszawa.java14.animal.Cat;
import pl.com.mpas.warszawa.java14.animal.Dog;
import pl.learn.theory.javaclass1.equals_and_hashcode.Person;

public class HolderTest {

    public static void main(String[] args) {
        ObjectHolder holder = new ObjectHolder();
        holder.setSecret(new Person("m", "j", 7));

        GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setSecret ("sekret");
        System.out.println(stringHolder.getSecret());

        GenericHolder<Person> personHolder = new GenericHolder<>();
        personHolder.setSecret(new Person("m", "j", 3));
        System.out.println(personHolder.getSecret());

        // Zwierz w kazdym wypadku zamieni sie na Dog, Cat,... bo to jest generic place holder
        Home<Dog> dogsHome;
        Home<Cat> catsHome;

    }


}
