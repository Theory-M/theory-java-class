package pl.learn.theory.javaclass1.lambda.excercise;

public class Main {

    String main;

    public static void main(String[] args) {
        // najpierw robie nowe obiekty
        Trainer trainer = new Trainer();
        MyThread myThread = new MyThread();

        // najpierw sposobem dluzszym, jako klasa anonimowa
        Excercise job = new Excercise() {
            @Override
            public void swim() {
                System.out.println("swimming");
            }
        };

        // Lambda w skrocie przy INTERFACE
        Excercise lambdaJob = () -> {}; // () = nic nie przyjmuje (swim(NIC)) i {} czyli nic nie zwraca bo cialo metody jest puste {}

        // z innym interface'em
        MyRunnable run = () -> {}; // ma void run();

        // tutaj robie metode swim()
        trainer.performExcercise(() -> System.out.println("Swim"));

        // tutaj Java bierze typ docelowy z Klasy MyThread ktorej metoda przyjmuje (MyRunnable run)
        myThread.performJob(() -> System.out.println("performing Job from MyThread"));

    }
    // metoda ktora robi nowe Excercise
    private static Excercise makeNewExcercise(){ //"Excercise A"
        // klasa anonimowa :
        return new Excercise() {
            String version ="v1.0";
            @Override
            public void swim() {
                System.out.println("my new excercise");
            }
        };
    }

    // jak napisze cos takiego, to bede mial zupelnie nowy obiekt Klasy "Excercise B"
    private static Excercise makeNewExcerciseV2(){
        // klasa anonimowa :
        return new Excercise() {
            String version ="v1.0";
            @Override
            public void swim() {
                System.out.println("my new excercise");
            }
        };
    }

    // metoda ktora zrobi Excercise, ale zwroci Lambde:
    // Excercise lambdaJob = () -> {}; // void swim();
    private Excercise makeLambdaExcercise (){
        return () -> {
            System.out.println(this.main);
        };// "()" czyli new Excercise + "{}" czyli void swim();
    }

    // jak napisze cos takiego, to bede mial dokladnie ten sam obiekt co wyzej
    private Excercise makeLambdaExcerciseV2 (){
        return () -> {
            System.out.println(this.main);
        };// "()" czyli new Excercise + "{}" czyli void swim();
    }
}
