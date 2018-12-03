package pl.learn.theory.javaclass1.generic;

import pl.learn.theory.javaclass1.string_tests.vehicle.Airplane;
import pl.learn.theory.javaclass1.string_tests.vehicle.Boat;
import pl.learn.theory.javaclass1.string_tests.vehicle.Car;
import pl.learn.theory.javaclass1.string_tests.vehicle.Vehicle;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GenericVehicleTest {

    // method takes List of Vehicle
    // method for displaying Cars/Plane -- iterowanie pojazdow -- wyswietlanie Vehiclow
    // method for adding Cars to List
//
//    klucz
//    (List<? super Dog > animals)
//    (list<? extends Animal> animals)

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new LinkedList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Boat());
        vehicleList.add(new Airplane());

        Scanner sc = new Scanner(System.in);

//        String x = sc.next();
//        int i = Integer.parseInt(x);
//        System.out.println(i);

        if (sc.hasNext("vehlist")){
            addVehicle(vehicleList);
        }

//        System.out.println(vehicleList);

        if (sc.hasNext("vehicles")){
            System.out.println(vehicleList);
        }


    }
    public static void addVehicle (List<? extends Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

    }
}
