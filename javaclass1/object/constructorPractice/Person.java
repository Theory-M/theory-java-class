package pl.learn.theory.javaclass1.object.constructorPractice;

public class Person {
    public String name;
    public String surname;
    public int age;


    public Person(){
        //empty
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void introducePerson(){
        System.out.println("Hi, I'm " + name + " " + surname + " I'm " + age + " Years old.");
    }





}
