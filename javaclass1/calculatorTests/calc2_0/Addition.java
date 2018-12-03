package pl.learn.theory.javaclass1.calculatorTests.calc2_0;

public class Addition implements Operation {
    @Override
    public long perform(long a, long b) {
        return a + b;
    }
}
