package pl.learn.theory.javaclass1.collection.list;

import pl.learn.theory.javaclass1.string_tests.animal.Animal;
import pl.learn.theory.polymorphism.plant.Cactus;
import pl.learn.theory.polymorphism.plant.Oak;
import pl.learn.theory.polymorphism.plant.Plant;
import pl.learn.theory.polymorphism.plant.Rose;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {
    public static void main(String[] args) {
        //String[] lista Stringow, przechowuje tylko Stringi
        List<String> strings = new ArrayList<>();
        strings.add("enum");
        strings.add("abstract");

        //wypisanie 'slabszym sposobem
        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
            System.out.println();
        }

        // wypisanie 'leszpym sposobem
        for (String s : strings){
            System.out.println(s);
        }

        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus(5,25,55));
        plants.add(new Oak(5,25,55));
        plants.add(new Rose(8,12,9));

        // modyfikowanie na pozycji pierwszej
        plants.set(1, new Rose(4,7,8));
//        plants.remove() itp
    }
    public static void processAnimalArray(Animal[] animals){
        for(Animal animal : animals){
            System.out.println(animal);
        }
    }
}
