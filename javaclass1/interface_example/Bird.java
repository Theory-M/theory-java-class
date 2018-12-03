package pl.learn.theory.javaclass1.interface_example;

public class Bird implements Moveable, Flyable{
    @Override
    public void move() {
        System.out.println("Bird is moving...");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
