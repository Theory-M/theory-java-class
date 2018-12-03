package pl.learn.theory.javaclass1.exceptions;

public class WrongParameter extends Exception {

    public WrongParameter(){

    }

    public WrongParameter(String message){
        super(message);
    }

    public WrongParameter(String message, Throwable cause){
        super(message,cause);
    }
}
