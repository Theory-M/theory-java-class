package pl.learn.theory.javaclass1.sorting.car;

import java.time.LocalDate;

public class Car implements Comparable<Car>, CarConcat<Car>{



    private String brand;
    private String model;
    private String color;
    private LocalDate productionYear;
    private int power;

    public Car(String brand, String model, String color, LocalDate productionYear, int power) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.power = power;
    }

    // bez SETTERow, bo nie zawsze dobrze jest miec settery

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        // return productionYear.getyear() - car.getYear();
        return productionYear.compareTo(car.productionYear);

        // w odwroconej kolejnosci:
        // return -1* productionYear.compareTo(car.productionYear);

        // ewentualnie jesli jest INT:
        // return car.power-power;

//        return brand.compareTo(car.brand);
    }

    public void maybeCompare(Comparable<Car> carComparable){
        carComparable.compareTo(this);
    }

    @Override
    public void concatTwoBrands(Car object) {
        System.out.println(brand + "-" + object.brand);

    }

    public void doSomething (CarConcat<Car> carConcat){
        carConcat.concatTwoBrands(this);
    }
}
