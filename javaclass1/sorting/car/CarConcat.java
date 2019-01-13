package pl.learn.theory.javaclass1.sorting.car;

@FunctionalInterface // z jednym obiektem to tylko wyglada jak FI, ale nim nie jest
public interface CarConcat<T> {

    void concatTwoBrands(T object);
    // concat this and other brand (sklejanie)
}
