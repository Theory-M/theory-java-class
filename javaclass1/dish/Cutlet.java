package pl.learn.theory.javaclass1.dish;

public class Cutlet {

    //jesli zrobie private to nie bede mogl wolac tego poza obszarem tej klasy
//    private Cutlet(){
//        System.out.println("Cutlet");
//    }
    private Cutlet(){

    }
    public static Cutlet giveMeNewNormalCutlet(){
        return new Cutlet();
    }
    //metoda fabryczna ma byc statyczna
    public static Cutlet withAdditions (String additions){
        return new Cutlet(additions);
    }
//    public Cutlet(){
//        this("onions");
//        System.out.println("Cutlet()");
//    }
    public Cutlet(String additions){
        super();
        System.out.println("Cutlet with additions... " + additions);
    }

}
