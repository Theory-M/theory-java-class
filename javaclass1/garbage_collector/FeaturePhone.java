package pl.learn.theory.javaclass1.garbage_collector;

public class FeaturePhone {

    private String model;
    private int[] a = new int[1000_000];

    public FeaturePhone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
