package pl.learn.theory.javaclass1.runnable;

// 1 zwykla klasa implementujaca runnable
class ImpRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("from ImpRunnable");
    }
}

public class Main {

    public static void main(String[] args) {

        //2 - tworzenie klasa anoniowa z nowym OBIEKTEM o referencji myRun
        Runnable myRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("from anonymous with refference");
            }
        };
        processRunnable(myRun);

        //  3 - kl anonimowa przekazana jako parametr
        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("from anonymous class as parametre");
            }
        });

        // 4 lambda - jednorazowy uzytek
        processRunnable(() -> System.out.println("I am a lambda processRunnable"));

        //5 lambda z utworzeniem referencji myLambdaRun
        Runnable myLambdaRun = () -> {
            System.out.println("I am from myLambdaRun");
        };
        processRunnable(myLambdaRun);
        System.out.println(myLambdaRun);

        ImpRunnable impRrunnable = new ImpRunnable();
        impRrunnable.run();

        processRunnable(impRrunnable);



    }
    private static void processRunnable (Runnable runnable){
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();
        System.out.println();
    }
}
