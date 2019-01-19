package pl.learn.theory.javaclass1.solid.liskov_substitution;

public class Main {

    public static void main(String[] args) {

        final String samsung = "Samsung";

        FeaturePhone samsungFeaturePhone = new FeaturePhone(samsung);
        Smartphone samsungSmartphone = new Smartphone(samsung);

        // to sa rozne obiekty i moge to sprawdzic tak, dostajac odpowiedz 'false'
        System.out.println(samsungSmartphone.equals(samsungFeaturePhone));
        System.out.println(samsungFeaturePhone.equals(samsungSmartphone));
        // ta domyslna metoda equals lamie zasade liskov
        // ale przerobilem equals w FeaturePhone na instanceOf FeaturePhone, wiec pokaze mi true

        // jak przerobilem equals w FeaturePhone na instanceOf Smartphone to dziala w jedna strone a w druga nie
    }
}
