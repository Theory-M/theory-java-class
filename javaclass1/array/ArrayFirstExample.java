package pl.learn.theory.javaclass1.array;


import pl.com.mpas.warszawa.java14.animal.Animal;
import pl.com.mpas.warszawa.java14.animal.Cat;
import pl.com.mpas.warszawa.java14.animal.Dog;
import pl.learn.theory.javaclass1.string_tests.vehicle.Boat;
import pl.learn.theory.javaclass1.string_tests.vehicle.Car;

public class ArrayFirstExample {
    public static void main(String[] args) {
        int[] firstArray = new int[4];
        Object o = firstArray;
        firstArray = new int[5];

        Object[] objects = new Object[2];
        firstArray[0]=1;
        firstArray[1]=2;
        firstArray[2]=3;
        firstArray[3]=4;
        firstArray[4]=5;

        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = i + 1;
        }

        Animal[] animals = makeAnimals();
//        taki FOR mozna tez tak jak nizej
//        for (int i = 0; i < animals.length; i++){
//
//        }
//        tak jest szybciej:
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        Animal[] animals1 = new Animal[2];
        animals1[0] = new Dog();
        animals1[1] = new Cat();
        processAnimalArray(animals);

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimalArray(dogs);
        //dodaj ptaka do psow -- bedzie blad wiec nizej zabezpieczenie
        addCatToArray(dogs);

        Cat[] cats = new Cat[2];
        cats[0] = new Cat();
        cats[1] = new Cat();
        processAnimalArray(cats);
        addCatToArray(cats);

    }
    public static Animal[] makeAnimals(){
        Animal[] result = new Animal[2];
        result[0] = new Dog();
        result[1] = new Cat();

        return result;
    }

    public static void checkEnhancedFor() {
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[4];

        for (Object o : objects){
            System.out.println(o);
        }
        for (Dog dog : dogs){
            System.out.println(dog);
        }
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }

    public  static  void  processAnimalArray(Animal[] animals){
        for (Animal animal : animals){
            animal.whichAnimal();
        }
    }
    public static void addCatToArray(Animal[] cats){
        if (cats instanceof Cat[]) {
            cats[0] = new Cat();
        } else{
            System.out.println("Warning!! Cannot add cat!!!");
        }

        }

}
