package pl.learn.theory.javaclass1.string_tests.vehicle;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.BMPattern;
import sun.text.normalizer.VersionInfo;

import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle airplane = new Airplane();

        Vehicle ford = new Vehicle();
        ford.move();

        Vehicle kuter = new Boat();
        kuter.move();

        Airplane cesna = new Airplane();
        cesna.move();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        airplane.increaseSpeed();

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(airplane);

        increaseSpeed(vehicle);
        increaseSpeed(car);
        increaseSpeed(boat);
        increaseSpeed(airplane);

    }

    public static void processVehicle(Vehicle vehicle){
        System.out.println("Info about vehicle: " + vehicle);
    }

    public static void increaseSpeed(Vehicle vehicle){
        System.out.println("from method increaseSpeed(Vehicle)");
        vehicle.increaseSpeed();
        //pusty wiersz zeby odznaczyc to dodac:
        System.out.println();
    }
}
