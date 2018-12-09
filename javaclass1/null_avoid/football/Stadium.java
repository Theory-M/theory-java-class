package pl.learn.theory.javaclass1.null_avoid.football;

public class Stadium {
    private Seat seat;

    public Stadium(Seat seat) {
        this.seat = seat;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "seat=" + seat +
                '}';
    }
}
