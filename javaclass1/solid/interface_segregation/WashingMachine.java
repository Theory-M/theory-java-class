package pl.learn.theory.javaclass1.solid.interface_segregation;

public class WashingMachine {

    private RunEngine engine;

    public WashingMachine(RunEngine engine) {
        this.engine = engine;
    }

    public void beginWash(){
        System.out.println("beginWash()");
        engine.start();
    }
    public void endWash(){
        System.out.println("endWash()");
        engine.stop();
    }
}
