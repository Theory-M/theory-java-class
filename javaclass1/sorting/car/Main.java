package pl.learn.theory.javaclass1.sorting.car;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 7 aut
        // do kolekcji
        // naturalny porzadek czyli domyslny Comparable
        //

        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("porsche", "carrera", "black", LocalDate.of(1995,1,11), 300),
                new Car("ford", "mustang", "red", LocalDate.of(1876, 1, 02), 350),
                new Car("s", "tert", "green", LocalDate.of(2004, 9, 02), 135),
                new Car("a", "wert", "blue", LocalDate.of(2004, 3, 02), 133),
                new Car("f", "asdf", "black", LocalDate.of(1987, 9, 02), 144),
                new Car("e", "xfgg", "yellow", LocalDate.of(2015, 9, 02), 532),
                new Car("q", "werth", "yellow", LocalDate.of(2012,2,23), 112)));

        // robie nowy obiekt typu CarPlayer
        CarPlayer carPlayer = new CarPlayer();
        // wyslac car do niego
        // wyslac lambde x2
//        Car delorian = new Car("d", "e", "red", LocalDate.of(2004,2, 03),111);

        // 2 daje mi 3-ci samochod z listy powyzej
        carPlayer.playWithCarActions(cars.get(2), car -> System.out.println("from lambda"));
        carPlayer.playWithCarActions(cars.get(1), car -> {
            System.out.println("playWithCarActions() car with lambda... " +car);
        });

        cars.get(1).compareTo(cars.get(2));

        cars.get(2).maybeCompare(o -> o.getPower());

        System.out.println("Before sorting");
        System.out.println(cars);

        System.out.println("After sorting...");

        Collections.sort(cars);
        System.out.println(cars);

        // odwrocone porownanie za pomoca REVERSE:
        Collections.sort(cars, new BrandComparator().reversed());
        System.out.println(cars);

        // mozna jeszcze krocej:
        cars.sort(new CarPowerComparator());


        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -1*o1.getColor().compareTo(o2.getColor());
            }
        });

        // za pomoca lambdy po kolorach (bez oddzielnej klasy do porownywania):
        cars.sort((o1,o2)-> 0);

        cars.sort((o1,o2) -> o1.getColor().compareTo(o2.getColor()));


    }
}
