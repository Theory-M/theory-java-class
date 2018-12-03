package pl.learn.theory.polymorphism.plant;

public class Cactus extends Plant {

    public Cactus(int heigthInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heigthInCm, waterUseInMl, currentWaterLevelInMl);
    }

    //    override jest po to, zeby nie robic problemow przy zmianie nazwy glownej metody itp
    @Override
    public void grow() {
        heigthInCm += 5;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public int getRequiredIncreaseWaterInMl() {
        return super.getRequiredIncreaseWaterInMl();
    }
}
