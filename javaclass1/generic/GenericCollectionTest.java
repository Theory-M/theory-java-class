package pl.learn.theory.javaclass1.generic;


import pl.com.mpas.warszawa.java14.animal.Animal;
import pl.com.mpas.warszawa.java14.animal.Cat;
import pl.com.mpas.warszawa.java14.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionTest {

    // method takes list of Animals
    // send Dogs and Cats

    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimal(dogs);

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        processAnimals(dogsList);

        addDog(dogsList);
    }

    public static void processAnimal(Animal[] animals) {

        for (Animal animal : animals) {
            System.out.println(animal);
        }
        //
    }

    public static void addDog(List<? super Dog> animals){
        animals.add(new Dog());
    }

    public static void processAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {
            System.out.println(animal);
        }
        // tak nie mozna dodawac:
//        animals.add(new Dog());
    }
}