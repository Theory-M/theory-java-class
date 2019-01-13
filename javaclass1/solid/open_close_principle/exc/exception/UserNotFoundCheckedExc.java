package pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception;

public class UserNotFoundCheckedExc extends Exception {

    public UserNotFoundCheckedExc(){
        // empty
    }

    public UserNotFoundCheckedExc(String message){
        super(message);
    }

    public UserNotFoundCheckedExc(String message , Throwable cause){
        super(message, cause);
    }
}
