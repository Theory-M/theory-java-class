package pl.learn.theory.javaclass1.calculatorTests.calc2_0;

public interface Operation {
    long perform (long a, long b);

    static Long calculate(Operation op, Long a, Long b){
        return op.perform(a,b);
    }
}
