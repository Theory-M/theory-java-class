package pl.learn.theory.javaclass1.string_tests.vehicle;

public class Boat extends Vehicle {

    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Boat is swimming");
    }

    public void size(){
        System.out.println("size()");
    }

    @Override
    public String toString() {
        return "Boat";
    }
    @Override
    public void increaseSpeed(){
        System.out.println("increase Speed () from Boat");
    }
}
