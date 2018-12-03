package pl.learn.theory.javaclass1.loop;

import java.util.Scanner;

public class WhileTest {

    private int a = 5;

    public int getA(){
        return this.a;
    }

    public static void main(String[] args) {

//
//
//        while (sc.hasNext())

        new WhileTest().a = 6;

        // dwa niezalezne obiekty, oba beda mialy w sobie 6, ale pierwszy nie zostanie zachowany
        new WhileTest().getA();
        new WhileTest().getA();

//        while (!sc.hasNext("r")){
//            sc.next();
//        }
        char currentChar = 'r';
        while (currentChar != 'r') {
            //read char
            Scanner sc = new Scanner(System.in);
            sc.next();
        }
        Scanner sc = new Scanner(System.in);

        for (; currentChar != 'r'; ){
            //read char
        }
//        najprostsza nieskonczona petla
//        for (;;){}

        do {
            //do something
        }while ((currentChar != 'r'));

        // zasymulowac do-while przy pomocy samego WHILE
        //do something
        while (currentChar != 'r'){
            //read char
        }



    }
    public static void printNumbers() {
        //100 razy ale wypisuj do 51
        for (int i = 1; i <= 100; i++){
            if (i < 52){
                System.out.println("i: " +i);
            }
            //tyle wystarczy, ale nie jest OK, bo 100 a need 51: Tak jest lepiej:
            else {
                break;
            }
        }
    }
}
