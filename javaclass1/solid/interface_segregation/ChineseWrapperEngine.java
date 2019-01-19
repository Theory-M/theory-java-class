package pl.learn.theory.javaclass1.solid.interface_segregation;

public class ChineseWrapperEngine implements RunEngine {

    ChineseEngine chineseEngine;

    public ChineseWrapperEngine(ChineseEngine chineseEngine) {
        this.chineseEngine = chineseEngine;
    }

    @Override
    public void start() {
        chineseEngine.chineseStart();
    }

    @Override
    public void stop() {
        chineseEngine.chineseStop();
    }
}
