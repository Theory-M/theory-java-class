package pl.learn.theory.javaclass1.interface_example;

public interface Constants {
    int numberOfWheels = 4;

    //to wyzej jest rownowazne z tym co wyzej
    final int numberOfWheels1 = 4;
    public final int getNumberOfWheels2 = 4;
    public static final int getNumberOfWheels3 = 4;

    public abstract void doIt();

}
