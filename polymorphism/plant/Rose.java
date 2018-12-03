package pl.learn.theory.polymorphism.plant;

public class Rose extends Plant {

    public Rose(int heigthInCm, int waterUseInMl, int currentWaterLevel) {
        super(heigthInCm, waterUseInMl, currentWaterLevel);
    }

    @Override
    public void grow() {
        heigthInCm = heigthInCm + 1;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public int getRequiredIncreaseWaterInMl() {
        return super.getRequiredIncreaseWaterInMl();
    }
}
