package pl.learn.theory.javaclass1.homework.beverages_stream_practice;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // skladniki
        Ingredient nuts = new Ingredient("nuts");
        Ingredient crustacians = new Ingredient("crustacians");
        Ingredient sesame = new Ingredient("sesame");
        Ingredient milk = new Ingredient("milk");

        // napoje
        Beverage first = new Beverage("first", Arrays.asList(nuts, sesame));
        Beverage second = new Beverage("second", Arrays.asList(milk, sesame, nuts));
        Beverage third = new Beverage("third", Arrays.asList(crustacians, sesame, milk));
        Beverage fourth = new Beverage("fourth", Arrays.asList(crustacians, sesame, milk));

        // menu
        Menu menu = new Menu();
        menu.addBeverage(first ,true);
        menu.addBeverage(second, false);
        menu.addBeverage(third, false);
        menu.addBeverage(fourth, true);

        System.out.println(getNutFreeBeverages(menu));

        System.out.println(getFilteredBeverages(menu,nuts));
    }
    // logika

    // podtsawowa metoda do filtrowania
    private static List<Beverage> getNutFreeBeverages (Menu menu){
        // najpierw tworze skladnik ktory chce ominac -- moze sie nazywac X
        // oraz liste
        Ingredient x = new Ingredient("nuts");
        List<Beverage>result = new ArrayList<>();

        // wiec moge tworzyc przefiltrowana liste napojow bez orzechow
        List<Beverage> withoutnuts = menu.getBeverages()
                .keySet()
                .stream()
                .filter(beverage -> !beverage.getIngredientList().contains(x))// NIE zawiera orzechow "!"
                .collect(Collectors.toList());

        // chcemy zrobic czesc wspolna powyzszego z tym co ponizej
        Map<Beverage, Boolean> beveragesOverSpecialOffer = menu.getBeverages();
        beveragesOverSpecialOffer.forEach((beverage, aBoolean)
                // jezeli Boolean promo jest True oraz moja lista powyzsza zawiera ten napoj
                -> {if (aBoolean && withoutnuts.contains(beverage)){
                    // dodaj do result
                result.add(beverage);
                }
        });


        return result;
    }

    // troche ulepszona metoda
    private static List<Beverage> getFilteredBeverages (Menu menu, Ingredient unwanted){

        return menu.getBeverages()
                // jak mam to...
                .entrySet()
                // to moge zrobic stream
                .stream()
                // wiec moge zaczac filtrowac -- jesli jest true, to biore, moge pisac bez "== true"
                .filter(beverageBooleanEntry -> beverageBooleanEntry.getValue() == true)
                // teraz przechodze na klucze, czyli Beverages
                .map(beverageBooleanEntry -> beverageBooleanEntry.getKey())
                // nie zawiera niechcianego skladnika
                .filter(beverage -> !beverage.getIngredientList().contains(unwanted))
                .collect(Collectors.toList());
    }

    // jeszcze lepsza metoda
    private static List<Beverage> betterVersionToGetFilteredBeverages(Menu menu, Ingredient unwanted){

        return menu.getBeverages()
                // jak mam entrySet() to...
                .entrySet()
                // to moge zrobic stream
                .stream()
                // wyfiltruj za pomoca isBevInOffer #1
                .filter(Main::isBevInOffer)
                // teraz przechodze na klucze, czyli uzywam metody changeIntoBeverage #2
                .map(Main::changeIntoBeverage)
                // nie zawiera niechcianego skladnika z metoda #3
                .filter(beverage -> getBeveragesWithoutUnwantedIngredient(beverage,unwanted))
                .collect(Collectors.toList());
    }

    // #1
    private static boolean isBevInOffer(Map.Entry<Beverage, Boolean> entry){
            return entry.getValue() == true;
    }

    // #2
    private static Beverage changeIntoBeverage (Map.Entry<Beverage, Boolean> entry){
        return entry.getKey();
    }

    // #3
    private static boolean getBeveragesWithoutUnwantedIngredient (Beverage beverage, Ingredient unwanted){
        return !beverage.getIngredientList().contains(unwanted);
    }
}
