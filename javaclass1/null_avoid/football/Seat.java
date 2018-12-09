package pl.learn.theory.javaclass1.null_avoid.football;

public class Seat {
    private SeatNumber seatNumber;

    public Seat(SeatNumber seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatNumber getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(SeatNumber seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber=" + seatNumber +
                '}';
    }
}
