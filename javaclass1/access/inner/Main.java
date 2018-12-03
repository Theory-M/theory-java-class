package pl.learn.theory.javaclass1.access.inner;

import pl.learn.theory.javaclass1.access.Person;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Michal", "J", -20);
        System.out.println(me);
        me.setAge(-50);
        System.out.println(me);
//        me.age = -50;
        System.out.println(me);
        // vez modyfikatora dostepu
//        me.secret = "my secret";
        //protected:
//        me.secondSecret = "second secret"

        Child child = new Child();
//        child.secondSecret = "hmmmmmm";

    }
}
