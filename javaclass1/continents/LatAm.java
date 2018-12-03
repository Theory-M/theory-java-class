package pl.learn.theory.javaclass1.continents;

public class LatAm extends Continent {
    public LatAm() {
    }
    static {
        System.out.println("LatAm static block");
    }
    static {
        System.out.println("LatAm static block");
    }
    {
        System.out.println("LatAm's init block");
    }
    {

    }
}
