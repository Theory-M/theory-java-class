package pl.learn.theory.javaclass1.exceptions;

public class MyException extends Exception {

    public MyException(){
        //konstruktor bezargumentowy
    }

    public MyException(String message){
        super(message);
    }

    public MyException(String message, Throwable cause){
        super(message, cause);
    }


}
