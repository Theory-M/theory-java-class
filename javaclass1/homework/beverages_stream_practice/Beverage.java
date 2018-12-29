package pl.learn.theory.javaclass1.homework.beverages_stream_practice;


import java.util.ArrayList;
import java.util.List;

public class Beverage {

    private List<Ingredient> ingredientList = new ArrayList<>();
    private String beverageName = "";

    public Beverage(String beverageName, List<Ingredient> ingredients) {
        this.beverageName = beverageName;
        // dodawanie skladnikow, bo nie bedzie wspoldzielona lista wszystkich skladnikow, a nowa lista
        ingredientList.addAll(ingredients);
    }

    // getter zeby dostac skladniki
    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "ingredientList=" + ingredientList +
                ", beverageName='" + beverageName + '\'' +
                '}';
    }
}
