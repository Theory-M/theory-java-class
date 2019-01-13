package pl.learn.theory.javaclass1.solid.open_close_principle;

public class CloudSaver implements Saver<BetterSecret>{
    @Override
    public void save(BetterSecret secret) {
        System.out.println("saving to cloud... ");

    }
}
