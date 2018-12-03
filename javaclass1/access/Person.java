package pl.learn.theory.javaclass1.access;

public class Person {
    private String name;
    private String surname;
//    public String surname; -- nie robic public
    private int age;
    //bez wpisanego modyfikaotra java stosuje pakiet jakis
    String secret;
    protected String secondSecret;
    public Person(){

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // zanegowanie false jest true -- ! neguje
        if (!checkAge(age)){
//        if (age < 0) {
            this.age = 0;
            return;
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

    private boolean checkAge(int age){
        if (age < 0){
            return false;
        }else {
            return true;
        }
    }
}

