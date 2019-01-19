package pl.learn.theory.javaclass1.solid.interface_segregation;

public class RussianEngineWrapper implements RunEngine {

    private RussianEngine russianEngine;


    // konstruktor jest konieczny bo inaczej dostaniemy NullPointerExcepption
    public RussianEngineWrapper(RussianEngine russianEngine) {
        this.russianEngine = russianEngine;
    }

    @Override
    public void start() {
        russianEngine.dawaj();
    }

    @Override
    public void stop() {
        russianEngine.dawaj();
        russianEngine.dawaj();
    }
}
