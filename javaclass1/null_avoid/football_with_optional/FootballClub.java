package pl.learn.theory.javaclass1.null_avoid.football_with_optional;

public class FootballClub {
    private Stadium stadium;

    public FootballClub(Stadium stadium) {

        this.stadium = validateStadium(stadium);
    }



    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = validateStadium(stadium);
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadium=" + stadium +
                '}';
    }

    private Stadium validateStadium(Stadium stadium){
        if (null == stadium){
            throw new IllegalArgumentException("stadium can't be null");
        }
        return stadium;
    }
}
