package pl.learn.theory.javaclass1.solid.liskov_substitution;

public class Smartphone extends FeaturePhone {

    public Smartphone(String model) {
        super(model);
    }
    protected boolean canBeEqual(){
        return true;
    }

    @Override
    public String getModel() {
        return "Smartphone" + super.getModel();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
