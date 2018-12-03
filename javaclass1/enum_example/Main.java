package pl.learn.theory.javaclass1.enum_example;

public class Main {

    public static void main(String[] args) {
        Seasons maybeSummer = Seasons.SUMMER;

        System.out.println(maybeSummer.name());

        //referencja, wiec mozna zmienic przypisanie
        maybeSummer = Seasons.WINTER;
        System.out.println(maybeSummer);

    }
}
