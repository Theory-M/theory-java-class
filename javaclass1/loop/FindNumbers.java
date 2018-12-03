package pl.learn.theory.javaclass1.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
    // List<Integer>
    // 1000 elements - 1: 100 - wylosowanych za pomoca Random
    // 51 - print index of 51
    // use break;

    public static void main(String[] args) {

        Random random = new Random();
        random.nextInt(101);

//        List<Integer> numbers = new ArrayList<>();
//
//        //dodac 1000 elementow
//        int size = 1000;
//        for (int i = 0; i < numbers.size(); i++){
//            numbers.set(i, i + 1);
//        }

        //dzielimy na podproblemy:
        // lista integerow:
        List<Integer> ints = new ArrayList<>();

        // wypelnic liste 1000 elementami:
        for ( int i = 0 ; i < 1000 ; i++){
            ints.add(random.nextInt(101));
        }

        //znalezc 51:
        // oszutwo: ints.contains(51);
        // ints.indexOf(51) ale chcemy sie nauzyc, wiec:
        int indexOf51 = -1; // -1 bo nie znamy tego indeksu
        for (int i = 0 ; i < ints.size(); i++){
            if (ints.get(i) == 51){
                indexOf51 = i;
                break;
            }
        }
        // wypisuje element o indeksie 51
        System.out.println("index of element: " + indexOf51);

    }

}
