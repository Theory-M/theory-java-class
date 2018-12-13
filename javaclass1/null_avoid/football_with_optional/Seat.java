package pl.learn.theory.javaclass1.null_avoid.football_with_optional;

public class Seat {
    private SeatNumber seatNumber;

    public Seat(SeatNumber seatNumber) {
        this.seatNumber = validateNumber(seatNumber);
    }

    public SeatNumber getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(SeatNumber seatNumber) {
        this.seatNumber = validateNumber(seatNumber);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber=" + seatNumber +
                '}';
    }

    private SeatNumber validateNumber(SeatNumber seatNumber){
        if (null == seatNumber){
            throw new IllegalArgumentException("seat number can't be null");
        }
        return seatNumber;
    }
}
