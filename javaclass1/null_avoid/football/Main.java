package pl.learn.theory.javaclass1.null_avoid.football;

import java.util.Optional;

// FootballClub -> nie jest nullem Stadion -> Chairs -> Number
// nie ma klubow bez stadionow
// ale moga byc bez krzeselek
public class Main {
    public static void main(String[] args) {

    }

    public static void displaySeatNumber(FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadium())
                .map(stadium -> stadium.getSeat())
                .map(seat -> seat.getSeatNumber())
                .map(seatNumber -> seatNumber.getSeatNumber())
                .ifPresent(dowolnaReferencja -> System.out.println("Number: " + dowolnaReferencja));
    }

    // czy to robi to samo???? :
    public static void displaySeatNumebrShorter(FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(FootballClub::getStadium)
                .map(Stadium::getSeat)
                .map(Seat::getSeatNumber)
                .map(SeatNumber::getSeatNumber)
                .ifPresent(integer -> System.out.println(integer));
    }
}
