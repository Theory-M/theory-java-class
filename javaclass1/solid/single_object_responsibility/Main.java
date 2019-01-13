package pl.learn.theory.javaclass1.solid.single_object_responsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // (1) 5 psow
        // ktos kto te psy tresuje
        // - uczy sztuczek
        // ktos kto je wyprowadza
        // miec mozliwosc leczenia psow
        // dieta dla psow

        Dog azor = new Dog ("Azor", "owczarek", 22, "Zenek");
        Dog kacha = new Dog ("Kacha", "retr", 11, "Jozek");
        Dog lola = new Dog ("lola", "dog", 33, "A");
        Dog rudy = new Dog ("Rudy", "ads", 55, "B");
        Dog mazur = new Dog ("Mazur", "dfg", 44, "C");
        Dog bolek = new Dog ("Bolek", "rtyu", 88, "C");
    }
}
