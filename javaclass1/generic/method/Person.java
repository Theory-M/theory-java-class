package pl.learn.theory.javaclass1.generic.method;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Double income;

    public Person (String name, String surname, Integer age, Double income){
        validate(name, surname, income);

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.income = income;
    }

    // 3 parametry
    // 2 tego samego typu
    // trzeci inny
//    private <T, V> Person(T name, T surname, V age){
//        if(null == name)
//            throw new IllegalArgumentException();
//        if (null == surname)
//            throw new IllegalArgumentException();
//        if (null == age)
//            throw new IllegalArgumentException();
//
//        return name;
//    }
    private <T, C> void validate(T a, T b, C c){
        if (null == a){
            throw new IllegalArgumentException();
        }
        if (null == b){
            throw new IllegalArgumentException();
        }
        if (null == c){
            throw new IllegalArgumentException();
        }
    }
}
