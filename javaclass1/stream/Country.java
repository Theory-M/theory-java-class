package pl.learn.theory.javaclass1.stream;

public class Country {

    private String name;
    private long numberOfPeople;
    private double area;
    private double averagePay;

    public Country(String name, long numberOfPeople, double area, double averagePay) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.area = area;
        this.averagePay = averagePay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", area=" + area +
                ", averagePay=" + averagePay +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAveragePay() {
        return averagePay;
    }

    public void setAveragePay(double averagePay) {
        this.averagePay = averagePay;
    }
}
