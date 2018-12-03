package pl.learn.theory.javaclass1.object;

public class Person {
    public static int numberOfPersons = 0;

    private String name;
    private String surname;
    private int age;

    public Person() {
        numberOfPersons++; // = numberOfPersons = numberOfPersons +1;
        //empty -- dodaje Konstruktor domyslny, bo jak dodam konstruktor wlasny, to nie dostane domyslnego, a jak chce z powrotem to musze recznie
    }

    public Person( String  name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPersons++;

    }
//    // To NIE jest Constructor, to jest METODA
//    public void Person (){
//
//    }

    public void introducePerson(){
        System.out.println("Hi, I'm " + name + " " + surname + " I'm " + age + " Years old.");
    }
//    public void fullMe(String name, String surname, int age){
//
//    }

    public static void somethingAboutPersons() {
        System.out.println("All people like math");
    }

    public static void accessToObjectPropertiesFromStatic(){

        //ze statycznych metod mozna miec dostep tylko do statycznych -- to nie zadziala
//        System.out.println("Name: " + name);

    }

    public static void printnumberOfPersons() {
        System.out.println("Number of persons so far: " + numberOfPersons);
    }
}

