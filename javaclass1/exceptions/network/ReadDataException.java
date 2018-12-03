package pl.learn.theory.javaclass1.exceptions.network;

public class ReadDataException extends RuntimeException {

    // prototyp wyjatku wlasnego z drezwa RuntimeException
    public ReadDataException(){
        //
    }

    public ReadDataException(String message){
        super(message);
    }

    public ReadDataException(String message, Throwable cause){
        super(message, cause);
    }
}
