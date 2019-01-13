package pl.learn.theory.javaclass1.exceptions;

public class ExceptionExample {

    public static void main(String[] args) throws MyException {
        MyExceptionThrower object = new MyExceptionThrower();
//        try {
        // na throwMyException Alt + Enter i lepiej uzyc drugiej opcji
            object.throwMyException();
            //ta linijka sie nie wykona:
            System.out.println("this will only print if I do not ask it to throw exc -- jesli zakomentuje throw exc w MyExceptionThrower");
//        } catch (MyException e) {
//            e.printStackTrace();
//        }

        // to sie nie wykona jesli uzyje drugiej metody -- przekazywania kartofla
        System.out.println("I can print this");


    }
}
