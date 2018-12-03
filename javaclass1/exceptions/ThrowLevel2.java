package pl.learn.theory.javaclass1.exceptions;

public class ThrowLevel2 {

    public void doIt() throws MyException{
        System.out.println("I'm from Do It method level 2 and I'm dangerous");

        MyExceptionThrower thrower = new MyExceptionThrower();
        thrower.throwMyException();;
    }
}
