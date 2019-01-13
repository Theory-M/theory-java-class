package pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception;

public class UserNotFoundUncheckedExc extends RuntimeException {

    public UserNotFoundUncheckedExc(){

    }
    public UserNotFoundUncheckedExc(String message){
        super(message);
    }
    public UserNotFoundUncheckedExc(String message, Throwable cause){
        super(message, cause);
    }
}
