package pl.learn.theory.javaclass1.exceptions;

public class PersonWithIllegalArgument {

    private String name;
    private String surname;
    private int age;

    //uzywanie wyjatku
    public PersonWithIllegalArgument(String name, String surname, int age) throws IllegalArgumentException {

        // nie -- name.equals("") bo problem z nullem
        // nie -- name == ""
        if (name == null || "".equals(name)){
            throw new IllegalArgumentException("invalid name " + name);
        }
        this.name = name;

        if (surname == null || "".equals(surname)){
            throw new IllegalArgumentException("invalid surname " + surname);
        }
        this.surname = surname;

        if (age <= 0){
            throw new IllegalArgumentException("invalid age " + age);
        }
        this.age = age;



    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


}

