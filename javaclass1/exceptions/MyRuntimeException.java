package pl.learn.theory.javaclass1.exceptions;

public class MyRuntimeException extends RuntimeException {

    // prototyp wyjatku wlasnego z drezwa RuntimeException
    public MyRuntimeException(){
        //
    }

    public MyRuntimeException(String message){
        super(message);
    }

    public MyRuntimeException(String message, Throwable cause){
        super(message, cause);
    }
}
