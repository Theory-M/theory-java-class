package pl.learn.theory.javaclass1.exceptions;

public class MyExceptionThrower {

    //metoda ktora wyrzuca wyjatki
    public void throwMyException() throws MyException{
        System.out.println("throwMyException()");
        throw new MyException("i threw the POTATO further by throwMyException method"); // jak to zakomentuje to metoda nie rzuci wyjatku, ale 'obiecuje' ze moze rzucic wyjatek
//        System.out.println("???"); // za throw nie moge juz nic dodac bo tam sie konczy kod
    }
}
