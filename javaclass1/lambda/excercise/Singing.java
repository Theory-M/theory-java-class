package pl.learn.theory.javaclass1.lambda.excercise;

@FunctionalInterface
public interface Singing {

    void soprano();
    default void bass(){
        System.out.println("bass singing...");
    };
    default void alto(){
        System.out.println("alto singing...");
    };

    default String getName(){
        return Singing.class.getSimpleName();
    }
    default void printName(){
        System.out.println(Singing.class.getSimpleName());
    }
}
