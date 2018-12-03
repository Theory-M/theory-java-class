package pl.learn.theory.javaclass1.equals_and_hashcode;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Michal", "j", 33);
        Person michal = me;

        System.out.println("me.equals(michal)= " + me.equals(michal));

        System.out.println("me == michal? = " + (me == michal));

        // tu robie NOWY obiekt, ktory juz nie jest tym co wyzej
        michal = new Person("Michal", "j",33);
        System.out.println("and now, me == michal? = " + (me == michal));

        System.out.println("me.equals(michal) = " + me.equals(michal));
    }
}
