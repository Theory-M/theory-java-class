package pl.learn.theory.javaclass1.null_avoid.football;

public class FootballClub {
    private Stadium stadium;

    public FootballClub(Stadium stadium) {
        this.stadium = stadium;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadium=" + stadium +
                '}';
    }
}
