package pl.learn.theory.javaclass1.solid.interface_segregation;

public class Main {

    public static void main(String[] args) {

        //

        WashingMachine polishWashingMachine1 = new WashingMachine(new PolishEngineWrapper(new RadomEngine()));
        WashingMachine polishWashingMachine2 = new WashingMachine(new PolishEngineWrapper(new RadomEngine()));

        WashingMachine indianWashingMachine1 = new WashingMachine(new IndianEngineWrapper(new IndianEngine()));
        WashingMachine chineseWashingMachine1 = new WashingMachine(new ChineseWrapperEngine(new ChineseEngine()));

        WashingMachine genericEngineWashingMachine1 = new WashingMachine(new RunEngine() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });

    }
}
