package pl.learn.theory.javaclass1.calculatorTests.calcCopyPractice;

public interface Operation {
    long perform (long a, long b);


    static long calculate(Operation op, long a , long b){
        return op.perform(a,b);
    }

}
