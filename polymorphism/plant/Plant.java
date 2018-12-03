package pl.learn.theory.polymorphism.plant;

public class Plant {

    protected int heigthInCm;
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;

    public Plant(int heigthInCm, int waterUseInMl, int currentWaterLevelInMl) {
        this.heigthInCm = heigthInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;
    }

    public void grow(){
        //empty
    }
    public int getRequiredIncreaseWaterInMl(){
        return 5;
    }

    public void increaseWaterLevel(int waterInMl){
        currentWaterLevelInMl += waterInMl;
    }

    public int getHeigthInCm() {
        return heigthInCm;
    }

    public int getCurrentWaterLevelInMl() {
        return currentWaterLevelInMl;
    }


    public int getWaterUseInMl() {
        return waterUseInMl;
    }



    @Override
    public String toString() {
        return "Plant{" +
                "heigthInCm=" + heigthInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
