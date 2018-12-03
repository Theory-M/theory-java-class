package pl.learn.theory.javaclass1.access.inner;

import pl.learn.theory.javaclass1.access.Person;

public class Child extends Person {
    public void sayHello () {
//        System.out.println("My secret: " + secret);
        System.out.println("My secret: " + secondSecret);
    }
}
