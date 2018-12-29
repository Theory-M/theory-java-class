package pl.learn.theory.javaclass1.homework.beverages_stream_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    Map<Beverage, Boolean> beverages = new LinkedHashMap<>();

    // dodawanie napojow do promocji
    public void addBeverage(Beverage beverage, Boolean specialOffer){
        beverages.put(beverage,specialOffer);
    }

    public Map<Beverage, Boolean> getBeverages() {
        return beverages;
    }
}
