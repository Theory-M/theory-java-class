package pl.learn.theory.javaclass1.string_tests.vehicle;

public class Airplane extends Vehicle {
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void move() {
        System.out.println("Plane is flying");
    }

    @Override
    public String toString() {
        return "Airplane";
    }
    @Override
    public void increaseSpeed(){
        System.out.println("increase Speed () from Airplane");
    }
}
