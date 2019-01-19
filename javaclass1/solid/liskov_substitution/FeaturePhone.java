package pl.learn.theory.javaclass1.solid.liskov_substitution;

public class FeaturePhone {

    protected String model;
    protected int[] a = new int[1000_000];

    // dobra praktyka dodawanie takiej metody: najpierw robie cos takiego, a potem dodaje to do modyfikowanego equalsa
    protected boolean canBeEqual(){
        return true;
    }

    public FeaturePhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    // equalsa musze dostosowac pod to, co robie. Wiec musze wiedziec, kiedy mi customowy equals jest potrzebny
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FeaturePhone)){
            return false;
        }
        // to jest domyslna implementacja, ktora jest zla, bo porownuje klasy:
        // if (o == null || getClass() != o.getClass()) return false;

        FeaturePhone that = (FeaturePhone) o;

        if (!that.canBeEqual()){
            return false;
        }

        return model != null ? model.equals(that.model) : that.model == null;
    }
}