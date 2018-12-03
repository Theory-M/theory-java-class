package pl.learn.theory.javaclass1.string_tests.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printName();



        Car ferrari = new Car();
        ferrari.printName();
        ferrari.speed();
        Vehicle car = (Vehicle) ferrari;


        car.printName();
        Car carForSure = (Car) car;
        ((Car) car).speed();

//        Boat boat


    }
}
