package pl.learn.theory.javaclass1.enum_example;

public enum Seasons {
    WINTER (-5),
    SPRING(6),
    SUMMER(30),
    AUTUMN(8);

    private float averageTempInC;
    private Seasons(float averageTempInC){
        this.averageTempInC = averageTempInC;
    }
    public float getAverageTempInC () {
        return averageTempInC;
    }
}
