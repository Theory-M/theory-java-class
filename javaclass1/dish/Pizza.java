package pl.learn.theory.javaclass1.dish;

public class Pizza extends Dish{

    //zaczynamy od:bloku statycznego
    static{
        System.out.println("Pizza - static block");
    }

    {
        System.out.println("Pizza - instance block");
    }
    //konstruktor:
    public Pizza(){
        //wywolam jeden konstruktor z drugiego kontruktora
        this("tuna");
        System.out.println("Pizza()");
    }
    public Pizza(String additions){
        //w pierwszej linijce moga byc dwa wywolania z tej klasy albo z nadklasy -- super i this
        //moge uzyc super, bo w Dish dalem konstruktor bez bloku, ktory ma domyslny super();, a ten dochodzi do Object
        super(5);
        System.out.println("Pizza with additions... ");
    }

}
