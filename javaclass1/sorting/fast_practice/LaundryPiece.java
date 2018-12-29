package pl.learn.theory.javaclass1.sorting.fast_practice;

public class LaundryPiece {
    private String name;
    private boolean clean;
    private boolean delicate;
    private double weight;

    public LaundryPiece(String name, boolean clean, boolean delicate, double weight) {
        this.name = name;
        this.clean = clean;
        this.delicate = delicate;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isDelicate() {
        return delicate;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "LaundryPieces{" +
                "name='" + name + '\'' +
                ", clean=" + clean +
                ", delicate=" + delicate +
                ", weight=" + weight +
                '}';
    }

}
