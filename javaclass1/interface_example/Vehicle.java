package pl.learn.theory.javaclass1.interface_example;

public class Vehicle implements Moveable{

    @Override
    public void move() {
        System.out.println("Vehicle in moving...");
    }
}
