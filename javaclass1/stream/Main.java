package pl.learn.theory.javaclass1.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("Poland", 40_000_000,312,4_000),
                new Country("China", 1_500_000_000,912,1_000),
                new Country("France", 230_000,312,1_000),
                new Country("Germany", 80_000_000,312,7_000),
                new Country("India", 810_000_000,312,1_00),
                new Country("Argentina", 440_000_000,3342,12_000)
        );

        genericFilter(countries,country -> country.getAveragePay()>10_000);
        genericFilter(countries,country -> country.getNumberOfPeople()> 100_000_000);


        List<Country> result = genericFilter(countries, country -> country.getAveragePay()>2_000);
        for (Country country : result){
            System.out.println();
        }
        result.forEach(country -> System.out.println());
        // albo LAMBDA


        System.out.println(genericFilter(countries,country -> country.getAveragePay()>10_000));
    }

    private List<Country> getListOfGoodPayingCounties (List<Country> countries,
                                                       double minimalPay){
        List<Country> result = new ArrayList<>();

        for (Country country : countries){
            if (country.getAveragePay()>= minimalPay){
                result.add(country);
            }
        }

        return result;
    }

    private List<Country> getHighlyPopulatedCountries (List<Country>countries, long minimalPopulation){
        List<Country> result = new ArrayList<>();

        for (Country country : countries){
            if (country.getNumberOfPeople()>=minimalPopulation){
                result.add(country);
            }
        }
        return result;
    }

    private static List<Country> filterByMinimalPopulation(List<Country> countries, long minimalPopulation){

        //tu zaczynam stream -- rozpoczynam prace STRUMIENIEM
        return countries.stream()
                // robie strumien ktory chce przecedzic
                .filter(country -> country.getNumberOfPeople()> minimalPopulation)
                // robie cecdak zeby wylapac to co chcialem:
                .collect(Collectors.toList());
    }

    // FILTR -- ogolny
    private static List<Country> genericFilter (List<Country> countries, Predicate<Country> predicate){

        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


}
