package pl.learn.theory.polymorphism.plant;

import pl.learn.theory.javaclass1.enum_example.Weekdays;

public class Main {
    public static void main(String[] args) {


        Plant[] plants = makePlants();

        Gardener edek = new Gardener();
        Gardener john = new BetterGardener();

//        edek.makePlantGrow(oldCactus);
//        edek.waterPlant(youngRose);

//      to samo co pentla poznizej
        for(Weekdays weekDay : Weekdays.values())
        // zrob cos 7 razy
//        for(int day = 0; day<7; day++)
             {
                 System.out.println("Day of the week: " + weekDay);
            for(Plant plant : plants){
                edek.waterPlant(plant);
                edek.makePlantGrow(plant);

                john.waterPlant(plant);
                john.makePlantGrow(plant);
            }
        }
        for (Plant plant : plants){
            System.out.println(plant);
        }
//            john.waterPlant(oldOak);
//            edek.waterPlant(youngCactus);
//
//            john.waterPlant(youngRose);
//
//            john.waterPlant(oldRose);
//
//            edek.makePlantGrow(youngCactus);
//
//        }
//        System.out.println("State of the young cactus: " + youngCactus);
//        System.out.println(youngCactus.currentWaterLevelInMl);
    }

    public static Plant[] makePlants(){
        Plant[] result = new Plant[6];

//        podluzny zapis tego, co nizej krocej:
        Plant oldOak = new Oak(1780, 5000, 0);
        result[0] = oldOak;

        Plant youngOak = new Oak(125, 1000, 0);
        result[1] = youngOak;

        Plant oldCactus = new Cactus(48, 16, 0);
        result[2] = oldCactus;

        Plant youngCactus = new Cactus(15, 7, 0);
        result[3] = youngCactus;

//        mozna bez referencji -- bo referencja pozniej okaze sie malo potrzebna, i tylko miejsce w wagoniku
        result[4] = new Rose(145, 900, 0);
        result[5] = new Rose(76,456, 0);

        return result;
    }
}
