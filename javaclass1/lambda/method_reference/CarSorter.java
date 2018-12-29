package pl.learn.theory.javaclass1.lambda.method_reference;

import java.util.ArrayList;
import java.util.List;

public class CarSorter {

    public static List<Car> sortCarsByModel (Car first, Car second, Sorter sorter){
        // najpierw tworze obiekt do ktorego bede wrzucal
        List<Car> result = new ArrayList<>();
        // sorter -> sortuje i daje wynik -1, 0, lub 1.
        int order = sorter.sort(first.getModel(),second.getModel());

        // wiec moge je uporzadkowac odwolujac sie do tego -1, 0, 1.
        if (order<0){
            result.add(first);
            result.add(second);
        }else{
            result.add(second);
            result.add(first);
        }
        return result;
    }
}
