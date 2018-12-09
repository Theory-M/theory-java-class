package pl.learn.theory.javaclass1.null_avoid;

public class Sink {
    private String label;

    //
    public Sink(String label){
        setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    // ustawiam Label z metoda sprawdzania Labela
    public void setLabel(String label) {
        this.label = validateLabel(label);
    }


    @Override
    public String toString() {
        return "Sink{" +
                "label='" + label + '\'' +
                '}';
    }

    // metoda ktora sprawdza czy Label jest OK -- zwraca String'a
    private String validateLabel(String label){
        // jesli nie NULL
        if (null == label){
            throw new IllegalArgumentException("label canot be null");
        }
        // zwraca Stringa
        return label;
    }
}
