package pl.learn.theory.javaclass1;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;

    //constructor -- porzadkuje mieszkanie
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public static void main(String[] args) {
        // honda = referencja, obiekt jest w nawiasach, i sklada sie ze stringow
        Car honda = new Car("Honda", "CRV", "red", 1991);
        // honda i triumph to sa referencje
        Car triumph = new Car("Triumph", "Spyder", "yellow", 1965);
        // referencje moga sie do siebie odnosic, staja sie wtedy powiazane, wiec problem z jedna oznacza problem z obiema
        Car mojeAuto = honda;
        //toString tu jest ale nie trzeba pisac
        System.out.println("Honda: " + honda.toString());
        System.out.println("Moje Auto: " +mojeAuto);

        Car autoMarka = null;
        System.out.println("Auto Marka: " + autoMarka);
        // + oznacza laczenie stringow
        System.out.println("Moje Auto: " + honda.getColor());
        System.out.println("Moje Auto, rok: " + honda.getYearOfProduction());
    }
}
