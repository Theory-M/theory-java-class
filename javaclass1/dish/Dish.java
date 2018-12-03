package pl.learn.theory.javaclass1.dish;

public class Dish {
    //dodaje zmienna prywatna String "kind"
    private String kind;

    //o kolejnosci wykonywania i kompilowania
    {
        System.out.println("Dish - Static First init block");
    }


    //co to robi?
    static {
        System.out.println("Dish - static first initialization");
    }
    {
        System.out.println("Dish - Static Second init block");
    }

    //to jest Konstruktor: public wiec bedzie widoczny w okolicy. Taki sam jak nazwa Klasy, bez niczego zwracanego ()
    public Dish() {
        //wolam konstruktor ze stringiem wiec wola:
        this("pasta");
        System.out.println("Dish()");
    }

    //overloading -- jest konstruktor int, wiec jak przekazemy INT to on uzyje tego konstruktora
    public Dish (int hmmm){
        //tu jest: super(); ale tego nie widac
    }

    //overloading - wieokrotne/ponowne wykorzystanie tej samej nazwy ale z innym wyroznikiem -- parametrami, unikalnymi. Jakie parametry wstawie, taka zostanie uzyta metoda
    public Dish(String kind){
        super();
        System.out.println("Dish() " + kind);
        this.kind = kind;
    }

    static {
        System.out.println("Dish - static dish class initialization");
    }
}
