package pl.learn.theory.javaclass1.calculatorTests.calcCopyPractice;

public class Addition implements Operation {
    @Override
    public long perform(long a, long b) {
        return (a + b);
    }
}
