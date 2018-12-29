package pl.learn.theory.javaclass1.lambda.excercise;

// 1 chcemy lamdby wiec sie zabezpieczamy dodaniem:
@FunctionalInterface
public interface Excercise {

    // ta metoda bedzie implementowana przy uzyciu LAMDB
    public abstract void swim();

    // i teraz nie moge dodac kolejnej metody, chyba ze zrobie je Default :
    // default znaczy domyslna implementacja, czyli bedzie uzywal ciala tej metody chyba ze nadpisze z @Override
    default void jogging(){};
    default void jump(){};
}
