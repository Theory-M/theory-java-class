package pl.learn.theory.javaclass1.exceptions;

public class MyNewException extends Exception {

    public MyNewException(){
        //
    }

    public MyNewException(String message){
        super(message);
    }

    public MyNewException(String message, Throwable cause){
        super(message,cause);
    }
}
