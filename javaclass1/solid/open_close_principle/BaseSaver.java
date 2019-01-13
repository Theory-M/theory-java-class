package pl.learn.theory.javaclass1.solid.open_close_principle;

public class BaseSaver implements Saver<BetterSecret> {
    String user;
    String password;

    @Override
    public void save(BetterSecret secret) {
        System.out.println("saving to base...");

    }
}
