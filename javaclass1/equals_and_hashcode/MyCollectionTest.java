package pl.learn.theory.javaclass1.equals_and_hashcode;

import java.awt.*;
import java.util.*;
import java.util.List;

public class MyCollectionTest {

    public static void main(String[] args) {
        //2 lists
        // 500 items for each list
        // first for searching
        // second for adding

        //tworze 'random' klasy Random (jak int, String... ):
        Random random = new Random(100);
//        random.nextInt();

        List<Integer> integersForSearch= new ArrayList<>();
        List<Integer> integersForAdding = new LinkedList<>();

        long timeStart = System.currentTimeMillis();

        // robie liste 500-elementowa
        for (int i = 0; i <500; i++){
            integersForAdding.add(random.nextInt());
            integersForSearch.add(random.nextInt());
        }

        long timeElapsed = System.currentTimeMillis() - timeStart;
        System.out.println("Time elapsed: " + timeElapsed);

        for (int i = integersForSearch.size() -1; i > -1; i--){
            System.out.println("integersForAdding[" + i + "]: " + integersForAdding.get(i));
            System.out.println("integersForSearch[" + i + "]: " + integersForSearch.get(i));

        }

        //wypisanie elementow (???) :
        System.out.println(integersForAdding);
        System.out.println(integersForSearch);


    }
}
