package pl.learn.theory.javaclass1.exceptions;

public class MyRuntimeExceptionTest {

    public static void main(String[] args) {
        // 3 levels
        // level 3 -- throw MyRunTimeException
        // catch in main()

        try {
            level1();
        }catch (MyRuntimeException exc){
            exc.printStackTrace();
        }
    }

    public static void level1() { level2(); }

    public static void level2() throws MyRuntimeException { level3(); } // dokumentacja tego i wytlumaczenie jest w dokumentacji bo to co ponizej:

    public static void level3() throws MyRuntimeException { throw new MyRuntimeException("from level3() MyRunTimeException"); }



}
