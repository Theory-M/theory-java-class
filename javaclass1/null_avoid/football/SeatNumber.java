package pl.learn.theory.javaclass1.null_avoid.football;

public class SeatNumber {
    private int seatNumber;

    public SeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "SeatNumber{" +
                "seatNumber=" + seatNumber +
                '}';
    }
}
