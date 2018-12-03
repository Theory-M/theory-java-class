package pl.learn.theory.javaclass1.collection.list;

import pl.learn.theory.polymorphism.plant.Plant;

import java.util.ArrayList;
import java.util.List;


public class PlantList {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();

        for (Plant p : plants){
            System.out.println(p);
        }
    }

}
