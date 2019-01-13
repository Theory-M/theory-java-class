package pl.learn.theory.javaclass1.sorting.car;

@FunctionalInterface
public interface CarActions {

    void move(Car car); // tak by wygladala lambda do tego: car -> {}
    default void fly(Car car) {System.out.println("is flying");}
}
