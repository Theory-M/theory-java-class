package pl.learn.theory.javaclass1.null_avoid.football_with_optional;

import java.util.Optional;

public class Stadium {
    private Seat seat;

    public Stadium(Seat seat) {
        this.seat = seat;
    }

    public Optional<Seat> getSeat() {
        return Optional.ofNullable(seat);
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
