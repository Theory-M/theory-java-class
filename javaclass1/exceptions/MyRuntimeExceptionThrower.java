package pl.learn.theory.javaclass1.exceptions;

public class MyRuntimeExceptionThrower {

    //metoda ktora wyrzuca wyjatki
    public void throwMyRuntimeException() { // tu nie musze pisac throws MyRuntimeException bo throw jest nizej?
        System.out.println("throwMyRuntimeException()");
        throw new MyRuntimeException("i threw the POTATO further by throwMyRuntimeException method"); // jak to zakomentuje to metoda nie rzuci wyjatku, ale 'obiecuje' ze moze rzucic wyjatek
//        System.out.println("???"); // za throw nie moge juz nic dodac bo tam sie konczy kod
    }
}
