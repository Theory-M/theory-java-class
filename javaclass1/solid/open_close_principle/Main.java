package pl.learn.theory.javaclass1.solid.open_close_principle;

public class Main {

    public static void main(String[] args) {
        Secret secret = new Secret("lubie placki", "/home/theory/secret.txt");

        // czy tak jest OK?: ORAZ co to robi?:
        BetterSecret betterSecret = new BetterSecret("", new Saver<BetterSecret>() {
            @Override
            public void save(BetterSecret secret) {

            }
        });


        secret.save();

        // 2 implementacje Saver
        // czyli tworze dwie klasy (1) Filesaver i (2) BaseSaver
        // pierwsza zapis pliku (1)
        // druga zapis w bazie (2)
        // uzycie z jednym sekretem
        FileSaver fileSaver = new FileSaver();
        BaseSaver baseSaver = new BaseSaver();

        fileSaver.save(betterSecret);
        baseSaver.save(betterSecret);

        // generycznie:
        Saver<BetterSecret> fileSaver1 = new FileSaver();
        Saver<BetterSecret> baseSaver2 = new BaseSaver();
        Saver<BetterSecret> cloudSaver2 = new CloudSaver();

        BetterSecret myBetterSecret = new BetterSecret("super tajny", fileSaver1);



    }
}
