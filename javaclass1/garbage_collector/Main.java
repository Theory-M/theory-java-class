package pl.learn.theory.javaclass1.garbage_collector;

public class Main {

    public static void main(String[] args) {

        // wywoluje metode makeObject
        Object o = makeObject();
        // teraz jestem w tej metodzie -- na stosie

        {
            // blok kodu lokalny tworzy zakres widocznosci i obiektu a nie bede mogl uzyc poza tym blokiem
            Object a = new Object();
        }
        // a.metoda(); ... -- nie moge tak zrobic

        // teraz wywolam inna metode
        empty();
        // i ona teraz na stosie zamiast makeObject
    }

    public static Object makeObject(){
        String temporal = new String("lost one");
        empty();
        return new String("new String");
    }

    public static void empty(){}
}
