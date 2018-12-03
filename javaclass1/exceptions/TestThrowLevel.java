package pl.learn.theory.javaclass1.exceptions;

public class TestThrowLevel {

    public static void main(String[] args) {
        ThrowLevel2 l2 = new ThrowLevel2();
        try {
            // poprowadzi mnnie po calej drodze bledu czyli ze cos wylecialo na 1 poziomie
            l2.doIt();
        } catch (MyException e) {
            // cala sciezka kartofla
            e.printStackTrace();
        }
    }
}
