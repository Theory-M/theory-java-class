package pl.learn.theory.javaclass1.enum_example;

public enum Subjects {
    MATH (5),
    ENGLISH(13),
    GEOGRAPHY(4),
    ECONOMY(6);

    private int numberOfLessons;
    private Subjects (int numberOfLessons){
        this.numberOfLessons = numberOfLessons;
    }
    public int getNumberOfLessons(){
        return numberOfLessons;

    }

}
