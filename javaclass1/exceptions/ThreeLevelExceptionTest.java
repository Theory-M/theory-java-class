package pl.learn.theory.javaclass1.exceptions;

public class ThreeLevelExceptionTest {

    static int counter = 1;

    public static void main(String[] args) throws MyException {
        System.out.println("ThreeLevelExceptionTest Main");
        // MAIN jest ostatnim miejscem ktory moze cos z tym zrobic -- domyslnie program sie zlozy
        level1();
        // przy wyjatku zlapanym w Main to sie nie wykona, ale przy wyjatku zlapanym na innym pozionmie -- TAK
        System.out.println("main() - before end");

    }

    public static int level1() throws MyException {
        System.out.println("ThreeLevelExceptionTest level1()");
        // tutaj tez moge wypchnac poziom wyzej za pomoca alt + enter add signature // jak mam try/catch, to lapie tu
        try {
            level2();
        } catch (MyException e) {
            e.printStackTrace();
        }

        return 1;
    }

    public static int level2() throws MyException {
        System.out.println("ThreeLevelExceptionTest level2()");

        try {
            level3();
            // to sie wyswietli tylko jesli nie wyrzuci wyjatku :
            System.out.println("level2() after call to level3()");
            //metoda wyrzuci TYLKO jeden exception -- pierwszy ktory sie trafi
        } catch (MyNewException exc) {
            exc.printStackTrace();
        } catch (MyException esce){
            esce.printStackTrace();
            // Exception moze byc tylko na koncu -- ale nie powinno sie go dawac, bo nie wiadomo wtedy CO sie stalo
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("leve2() before return");
        return 2;
    }

    // jak jest sciezka pozytywna, to level 3, jak negatywna, to THROWS
    public static int level3() throws MyException, MyNewException {
        System.out.println("ThreeLevelExceptionTest level3()");

        // jak napisze tak -- to musze alt + enter
//        throw new MyException("Problem on level 3");
        // jak uzyje signature, to pojawi sie problem w level3()

        //jesli counter jest parzysty -- jesli wyskoczy to nie ide dalej i wracam do gory na podstawie throw MyException
        if (counter % 2 == 1){
            throw new MyException("Problem on level 3");
        } else if(counter==4){
            //jesli chce nowy exception, to nowa sciezka lapania z else if powyzej -- a potem trzeba wyjatek obsluzyc gdzies na sciezce
            throw new MyNewException("Problem on level 3()");
        }

        System.out.println("level3() before return");
        // jesli poleci wyjatek, to tutaj NIE dojde
        return 3;


    }
}
