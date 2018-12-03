package pl.learn.theory.javaclass1.string_tests.animal;

public class Main {
    public static void main(String[] args) {
        Dog azor = new Dog();
        azor.whichAnimal();
        azor.makeSounds();

        Animal maybeDog = new Dog();
        maybeDog.whichAnimal();
//        maybeDog.makeSounds();

        Animal maybeCat = new Cat();

        Animal maybeMonkey = new Monkey();
        Object monkey = new Monkey();
    }
}
