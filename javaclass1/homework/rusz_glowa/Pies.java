package pl.learn.theory.javaclass1.homework.rusz_glowa;

public class Pies {

    String name;
    int waga;

    @Override
    public String toString() {
        return "Pies{" +
                "name='" + name + '\'' +
                ", waga=" + waga +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public Pies(String name, int waga) {
        this.name = name;
        this.waga = waga;
    }
}
