package pl.learn.theory.javaclass1.casting;

public class Main {

    public static void main(String[] args) {
        // rzutowanie w góre UPCASTING
        Object object = new String("string");

        // rzutuje sobie na Stringa
        String string = (String) object; // teraz jest Stringiem
        // i moge:
        string.substring(1);

        // ewentualnie moge rzutowac tylko na chwile, na rzecz tego wywolania
        ((String)object).substring(2);

        processAnimal(new Monkey());
        processAnimal(new Elefant());

        // jakbym chcial randomowo Runnable uzyc to tak:
        ((Runnable)() -> {}).run();
    }

    public static void processAnimal(Animal animal){
        animal.makeSound();

        if (animal instanceof Monkey){
            ((Monkey)animal).jump();
        }else{
            System.out.println("something else");
        }
    }
}
