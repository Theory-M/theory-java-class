package pl.learn.theory.javaclass1.exceptions;

public class TestMyRuntimeException {

    public static void main(String[] args) {
        throw new MyRuntimeException("throwing runtime exception");

//        try {
//            // poprowadzi mnnie po calej drodze bledu czyli ze cos wylecialo na 1 poziomie
//            ;
//        } catch (MyRuntimeException e) {
//            // cala sciezka kartofla
//            e.printStackTrace();
//        }

    }
}
