package pl.learn.theory.javaclass1.generic;

import pl.com.mpas.warszawa.java14.animal.Animal;
import pl.com.mpas.warszawa.java14.animal.Dog;

import java.util.ArrayList;
import java.util.List;

// generic
// only Animals and extends
// method enterHome(animal type, animal reference) np (Dog d)
// method goOutside(xxx) // Dog goOutside()
// xxx = placeholder
public class Home <Zwierz extends Animal> {

    private Zwierz someone;

    public void enterHome(Zwierz someone){
        this.someone= someone;
        someone.whichAnimal();
    }

    public Zwierz goOutside (){
        return someone;
    }

//    ObjectHolder animalHolder = new ObjectHolder();
//    animalHolder.get
//
//
//    List<Zwierz> animalHome = new ArrayList<>();


//    public void enterHome(Zwierz e) {
//        animalHome.add(Dog d);
//
//    }
//    public void goOutside(Zwierz e){
//        animalHome.remove();
//    }
}

