package pl.learn.theory.polymorphism.plant;

public class Oak extends Plant {

    public Oak(int heigthInCm, int waterUseInMl, int currentWaterLevel) {
        super(heigthInCm, waterUseInMl, currentWaterLevel);
    }

    @Override
    public void grow() {
        heigthInCm = heigthInCm + 125;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public int getRequiredIncreaseWaterInMl() {
        return super.getRequiredIncreaseWaterInMl();
    }
}


