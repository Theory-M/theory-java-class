package pl.learn.theory.javaclass1.exceptions;

public class PersonTest {

    public static void main(String[] args) {
        Person me = null;


        try {
            // robie osobe z niedozwolonym wiekiem
            me = new Person("mich", "jjj", -6);
        } catch (WrongParameter wrongParameter) {
            wrongParameter.printStackTrace();
        }

        System.out.println(me);

        PersonWithIllegalArgument meAgain = new PersonWithIllegalArgument(null, "", -3);
    }
}
