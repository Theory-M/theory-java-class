package pl.learn.theory.javaclass1.string_tests.vehicle;

public class Car extends Vehicle {
    public void ride() {
        System.out.println("ride");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Car is driving");
    }

    public void speed(){
        System.out.println("speed()");
    }

    @Override
    public String toString() {
        return "Car";
    }
    @Override
    public void increaseSpeed(){
        System.out.println("increase Speed () from Car");
    }
}
