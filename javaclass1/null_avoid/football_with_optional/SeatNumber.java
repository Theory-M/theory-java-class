package pl.learn.theory.javaclass1.null_avoid.football_with_optional;

public class SeatNumber {
    private Integer seatNumber;

    public void SeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "SeatNumber{" +
                "seatNumber=" + seatNumber +
                '}';
    }
}
