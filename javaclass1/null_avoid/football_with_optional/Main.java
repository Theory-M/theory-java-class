package pl.learn.theory.javaclass1.null_avoid.football_with_optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    }

    public static void printSeatNumer(FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadium())
                .flatMap(stadium -> stadium.getSeat())
                .map(seat -> seat.getSeatNumber())
                .map(seatNumber -> seatNumber.getSeatNumber())
                .ifPresent(integer -> System.out.println(integer));
//                .ifPresent(s -> System.out.println("seat number:" +s));
    }
}
