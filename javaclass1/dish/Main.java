package pl.learn.theory.javaclass1.dish;

public class Main {
    public static void main(String[] args) {


//        Dish myLunch;
//
//        //wypisuje sie to co jest z konstruktora
//        myLunch = new Dish();
//
//        Dish secondLunch = new Dish();

        System.out.println("////////////////// tu zobacze kolejnosc ladowania");
        Dish pizza = new Pizza();

        //Prosba o zrobienie nowego kotletu
        Cutlet cutlet = Cutlet.giveMeNewNormalCutlet();
        Cutlet cutletWithOnion = Cutlet.withAdditions("onions");

    }
}
