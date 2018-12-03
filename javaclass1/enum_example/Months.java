package pl.learn.theory.javaclass1.enum_example;

public enum Months {
    JANUARY (31),
    FEBRUARY(28){
        @Override
        public int getNumberOfDays() {
            return super.getNumberOfDays();
        }
    },
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int numberOfDays;
    private Months (int NumberOfDays){
        this.numberOfDays = numberOfDays;

    }
    public int getNumberOfDays () {
        return numberOfDays;
    }
}
