package pl.learn.theory.javaclass1.object;

public class Main {
    public static void main(String[] args) {
        Person.somethingAboutPersons();

        Person nullPerson = null;
        nullPerson.somethingAboutPersons();


        Person me = new Person();
        me.introducePerson();;
        me.somethingAboutPersons();
    }
}
