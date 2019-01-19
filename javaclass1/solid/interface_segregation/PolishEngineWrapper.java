package pl.learn.theory.javaclass1.solid.interface_segregation;

public class PolishEngineWrapper implements RunEngine {

    private RadomEngine radomEngine;

    public PolishEngineWrapper(RadomEngine radomEngine) {
        this.radomEngine = radomEngine;
    }

    @Override
    public void start() {
        // robie delegacje do tego co umie
        radomEngine.start();
    }

    @Override
    public void stop() {
        radomEngine.stop();
    }
}
