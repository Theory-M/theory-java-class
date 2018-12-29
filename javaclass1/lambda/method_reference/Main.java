package pl.learn.theory.javaclass1.lambda.method_reference;

import java.util.List;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbb";

        // uzywam metody sortujacej alfabetycznie i będzie mi zwracalo "1", "-1"
        out.println(BrandSorter.brandOrder(a,b));
        out.println(BrandSorter.brandOrder(b,a));

        out.println(ModelSorter.modelOrder(a,b));
        out.println(ModelSorter.modelOrder(b,a));

        Car saab = new Car("Saab", "93", 200);
        Car porsche = new Car("Porsche", "Carrera", 300);

        List<Car> sortedCars = CarSorter.sortCarsByModel(saab,porsche,
                (first, second) -> first.compareTo(second));
        out.println(sortedCars);

        List<Car> sortedCars2 = CarSorter.sortCarsByModel(saab,porsche,((first, second) -> second.compareTo(first)));
        out.println(sortedCars2);

        // moge napisac cos takiego, ale...
        CarSorter.sortCarsByModel(saab,porsche,
                (first, second) -> ModelSorter.modelOrder(first,second));
        // ale, jesli moge zrobic krocej:

        // za pomoca referencji do metody
        CarSorter.sortCarsByModel(saab,porsche,
                ModelSorter::modelOrder); // przyjda tu argumenty -- deleguj je do metody

        // Lamdba
        CarPrinter carPrinter1 = car -> out.println(car);

        // moge przerobic na referencje do metody (Alt+Enter)
        CarPrinter carPrinter2 = out::println; // bez importowania java.lang.System.out byloby System.out::println;

        // i jeszcze szybciej... po zaimportowaniu
        CarPrinter carPrinter3 = out::println;

        //
        CarPrinter carPrinter4 = (Car car)-> System.out.println(car);

        // po dodaniu metody printYourself
        CarPrinter carPrinter5 = car -> car.printYourself();
        // referencja do metody
        CarPrinter carPrinter6 = Car::printYourself;
        // teraz moge tego uzyc
        carPrinter6.printCar(saab);
    }
}
