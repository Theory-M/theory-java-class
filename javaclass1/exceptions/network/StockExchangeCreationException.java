package pl.learn.theory.javaclass1.exceptions.network;

public class StockExchangeCreationException extends RuntimeException {

    // prototyp wyjatku wlasnego z drezwa RuntimeException
    public StockExchangeCreationException(){
        //
    }

    public StockExchangeCreationException(String message){
        super(message);
    }

    public StockExchangeCreationException(String message, Throwable cause){
        super(message, cause);
    }
}