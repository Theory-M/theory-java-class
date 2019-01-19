package pl.learn.theory.javaclass1.garbage_collector;

public class StackOverflowExample {

    public static void main(String[] args) {
        // wolam te metode siebie wolajaca zeby wywolac Stack overflow
//        callMe();

        // tak tez moge zrobic stack overflow
        one();
    }

    // tworze metode ktora wola sama siebie
    public static void callMe(){
        callMe();
    }

    public static void one(){
        two();
    }
    public static void two(){
        one();
    }
}
