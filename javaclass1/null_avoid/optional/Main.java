package pl.learn.theory.javaclass1.null_avoid.optional;

import pl.com.empas.java_introductory_course.java8.live_examples.OptionalExample;
import sun.swing.BakedArrayList;

import java.util.Optional;

public class Main {
    // co z tym nullem...
    public static void main(String[] args) {
//
//        House fullHouse = new House(new Bathroom(new Sink("Roca")));
//        House houseSinkNoLabel = new House(new Bathroom(new Sink(null)));
//        House almostFullHouse = new House(new Bathroom(null));
//        House emptyHouse = new House(null);

        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House((withoutSink));
        House withoutBathroom = new House(null);

        // tak nie piszemy nigdy!!!! :
//        Optional<String> maybeString;

        // tworze puste pudelko (puste)
        Optional<String> maybeString = Optional.empty();
        // tworze pudelko jak jestem pewien, ze nie ma NULL'a ***
        Optional<String> stringForSure = Optional.of("Mihal");
        if (stringForSure.isPresent()) {
            System.out.println(stringForSure.get());
        }
        String maybeNull = null;

        // to samo co *** ^
        Optional<String> absentString = Optional.ofNullable(maybeNull);
        absentString.ifPresent(x -> System.out.println(x));
    }

    // malo czytelne, ale dzialajace rozwiazanie:
    private static void printLabeWtihLambda(House house){
        // odpakowywanie pudelka w ktorym byc lub nie-byc House, Bathroom, Sink -- sprawdzam po kolei
        Optional.ofNullable(house)
                .ifPresent(house1 -> house1.getBathroom()
                        .ifPresent(bathroom -> bathroom.getSink()
                             .ifPresent(sink ->
                                  System.out.println(sink.getLabel()))));
    }

    // dluzsza wersja lambdowa
    private static void printLabelWithLambda(House house){
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label: "+ s));
    }

    // metoda poczatkowa do nauki:
    public static void printLabelWeak(House house){
        String label = "empty";
        // skoro ktos moze przyslac NULLa to robie opakowanie na DOM
        Optional<House> maybeHouse = Optional.ofNullable(house);

        if (maybeHouse.isPresent()){
            // robie nowe opakowanie na lazienke
            Optional<Bathroom> maybeBathroom = maybeHouse.get().getBathroom();

            if (maybeBathroom.isPresent()){
                Optional<Sink> maybeSink = maybeBathroom.get().getSink();

                if (maybeSink.isPresent()){
                    label = maybeSink.get().getLabel();
                }
            }
        }
        System.out.println(label);
    }

}
