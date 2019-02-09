package pl.learn.theory.javaclass1.design_patterns.builder_pattern;

public class Coffee {

    // ostateczna metoda BUDUJACA:
        public Coffee build(){ // brew a coffee
        Coffee coffee = new Coffee();
        return coffee;
    }
}
