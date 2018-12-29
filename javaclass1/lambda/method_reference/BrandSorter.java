package pl.learn.theory.javaclass1.lambda.method_reference;

public class BrandSorter {

    static int brandOrder(String brand1, String brand2){
        // fabryczny Comparable. W kolejnosci ALFABETYCZNEJ od poczatku
        return brand1.compareTo(brand2);
    }
}
