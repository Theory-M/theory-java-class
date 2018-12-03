package pl.learn.theory.javaclass1.abstract_class;

public class Ferrari extends Vehicle{

    @Override
    public void speedUp() {
        //obiekt rzeczywistym, wiec musi byc implementacja danej metody
        System.out.println("No!!!");
    }
}
