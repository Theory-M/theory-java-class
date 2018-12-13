package pl.learn.theory.javaclass1.stream.team;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // tworzymy 5 graczy...
        Player first = new Player("tito", 12, BigDecimal.valueOf(10_000));
        Player second = new Player("papi", 17, BigDecimal.valueOf(20_000));
        Player third = new Player("doni", 9, BigDecimal.valueOf(30_000));
        Player fourth = new Player("roki", 1, BigDecimal.valueOf(40_000));
        Player fifth = new Player("ana", 18, BigDecimal.valueOf(50_000));

        // i dwoch trenerow...
        Coach cena = new Coach("John", "Cena", BigDecimal.valueOf(12_000));
        Coach rock = new Coach("the", "Rock", BigDecimal.valueOf(100_000_000));
        Coach dude = new Coach("the", "Dude", BigDecimal.valueOf(6_000));
        Coach bean = new Coach("mr", "Bean", BigDecimal.valueOf(15_000));
        Coach dragon = new Coach("Steve", "the Dragon", BigDecimal.valueOf(150_000_000));

        // oraz druzyny... PIERWSZA
        Team misfits = new Team(cena);
        misfits.setPlayers(Arrays.asList(first, second));

        // i DRUGA
        Team pwnage = new Team(rock);
        misfits.setPlayers(Arrays.asList(third, fourth, fifth));

        // a na koniec je rejestrujemy w LIDZE (League) - czyli dodajemy do listy druzyn
        League hardcore = new League("Hard COREZ");
        hardcore.registerteam(misfits);
        hardcore.registerteam(pwnage);

        List<Player> players = new LinkedList<>(getAllLeaguePlayers(hardcore));

        // tak zrobiona lista dziala, ale do niej NIC nie mozna dodac
        List<Coach> coaches1 =Arrays.asList(cena,bean,dude,rock,dragon);

//        List<Coach> coaches2 = new ArrayList<>();
//        coaches1.add(cena);
//        coaches1.add(rock);
//        coaches1.add(dude);
//        coaches1.add(bean);
//        coaches1.add(dragon);

        List<Coach> coaches3 = new ArrayList<>(getAllCoaches(hardcore));
        System.out.println(coaches3);


        System.out.println(genPlayerFilter(players,player -> player.getSkill()>12));

        System.out.println(mariosGenFilter(hardcore, player -> player.getSkill()>12));

        mariosGenFilter(hardcore,player -> player.getNick().startsWith("p"));
    }

    // tworzymy metode ktora zwroci nam liste wszystkich zawodnikow z Ligi
    private static List<Player> getAllLeaguePlayers(League league){
        // co zwracam:
        return league
                .getTeamList().stream()
                // zrobie strumyk list z zawodnikami (Team)
                .map(team -> team.getPlayers())
                // FLATMAP zrobie strumyk samych Player'ow:
                .flatMap(players -> players.stream())
                .collect(Collectors.toList());
    }
    // to ja pisalem, czy jest OK - nie wiem:
    private static List<Coach> getAllCoaches(League league){
        // co zwracam:
        return league
                .getTeamList().stream()
                .map(team -> team.getCoach())
                .collect(Collectors.toList());
    }

    // wyszukiwanie Optional na wypadek gdybym dal wymagania przez ktore zaden trener nie przejdzie
    private static Optional<Coach> findTheSpecialCoachByName(List<Coach> coaches){
        return coaches.stream()
                .filter(coach -> coach.getName().length()==4)
                .findFirst();
    }

    // jeszcze inna opcja:
    private static List<Player> players = new ArrayList<>();
    private static void getAllLeaguePlayers1 (League league){
        // co zwracam:
        league
                .getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .forEach(player -> players.add(player));
    }


    // metoda do wypisywania zawodnikow starym sposobem
    private static List<Player> getPlayersOldWay(League league){
        // deklaruje liste o referencji RESULT do ktorej bede wrzucal Player'ow
        List<Player> result = new ArrayList<>();
        // najpierw przejrzyj Druzyny i w kazdej Druzynie...
        for (Team team : league.getTeamList()){
//            // w kazdej Druzynie przejrzyj Zawodnikow
//            for (Player player : team.getPlayers()){
//                result.add(player);
            // w skrocie:
            result.addAll(team.getPlayers());
            }
            return result;
    }

    // ja tak napisalem podczas cwiczenia
    private static List<Player> genPlayerFilter (List<Player>players, Predicate<Player> predicate){
        return players.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    // tak rozwiazanie zadania napisal Mariusz
    private static List<Player> mariosGenFilter (League league, Predicate<Player> predicate){
        return Collections.emptyList();
    }
}

