package pl.learn.theory.javaclass1.abstract_class;

public abstract class Vehicle {
    private int numberOfWheels;

    public int getNumberOfWheels (){
        return numberOfWheels;
    }

    public abstract void speedUp();
}
