package pl.learn.theory.javaclass1.sorting.car;

public class CarPlayer {

    public void playWithCarActions (Car car, CarActions ca){
        System.out.println("Inside playWithCarActions()");
        ca.fly(car);
        ca.move(car);
    }
}
