package pl.learn.theory.javaclass1.null_avoid;

import java.util.Optional;

public class Main {
    // co z tym nullem...
    public static void main(String[] args) {

        // mozna zapisac tak:
        House fullHouse = new House(new Bathroom(new Sink("Roca")));
        House houseSinkNoLabel = new House(new Bathroom(new Sink(null)));
        House almostFullHouse = new House(new Bathroom(null));
        House emptyHouse = new House(null);

        // albo tak:
        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House((withoutSink));
        House withoutBathroom = new House(null);

        // ktos moze zrobic psikus i bedzie KICHA
//        displaySinkLabelVeryVeryNaive(null);
        displaySinkLabelWithNullCheck(emptyHouse);

    }

    // metoda zakladajaca ze nikt mi NULLa nie przesle
    private static void displaySinkLabelVeryVeryNaive(House house){
        String label = house.getBathroom().getSink().getLabel();
    // zapis z innego jezyka:
//        String label2 = house?.getBathroom()?.getSink().getLabel();
//        System.out.println(label);
    }

    // poprawna metoda do wypisywania etykiety, ale nie idealna:
    private static void displaySinkLabelWithNullCheck(House house){
        // dodaje String defaultowy jesli nie mam Label'a
        String label = "default";

        System.out.println(label);
        if (null != house){
            Bathroom bathroom = house.getBathroom();

            if (null != bathroom){
                Sink sink = bathroom.getSink();

                if (null != sink){
                    label = sink.getLabel();
                }
            }
        }
    }

    //skoro nie dodalem Optional'i w House i Bathroom, to uzywam 'map', nie 'flatMap':
    private static void printLabelWithLamdbaLonger (House house){
        Optional.ofNullable(house)
                .map(House::getBathroom)
                .map(Bathroom::getSink)
                .map(Sink::getLabel)
                .ifPresent(System.out::println);
    }

    private static void printTransformed (House house){
        Optional.ofNullable(house)
                .map(House::getBathroom)
                .map(Bathroom::getSink)
                .map(Sink::getLabel)
                .ifPresent(s -> System.out.println("label: " + s));
    }


    String name = "";
//    tak w Kotlinie mozna sobie radzic z nullem
//    String? nameWithNull = null;
}
