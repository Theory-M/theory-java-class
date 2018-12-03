package pl.learn.theory.javaclass1.string_tests.vehicle;

public class Vehicle {
    private String name = "vehicle";
    protected String name2 = "vehicle";

    public void increaseSpeed(){
        System.out.println("increase Speed () from Vehicle");
    }

    public void printName() {
        System.out.println("vehicle");
    }
    public void move (){
        System.out.println("vehicle is moving");
    }


    @Override
    public String toString() {
        return "Vehicle";
    }
}
