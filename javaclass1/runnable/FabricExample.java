package pl.learn.theory.javaclass1.runnable;

public class FabricExample {
    String name = "Roland";
    public static void main(String[] args) {


        MyRunnable one = new MyRunnable();
        one.run();
        MyRunnable two = new MyRunnable();
        two.run();

        makeNewRunnable();
        makeNewRunnable();

    }

    private Runnable makeRunnableWithLambda(){
        // lambda robie obiekt typu Runnable:
        return () -> {
            String name = "Mini";
            // tak jest Mini
            System.out.println("My lambda name: "+ name);

            // this w Lambdzie odnosi sie do FabricExample ale private Runnable NIE moze byc 'STATIC'  wiec jest Roland
            System.out.println("My Lambda name: " + this.name);

        };
    }

    private static Runnable makeNewRunnable(){
        return new Runnable() {
            private String name = "Alfred";
            @Override
            public void run() {
                String name = "Izabela";
                // this - wez mi z obiektu TEJ klasy
                System.out.println("My name: " + name); // tak wezme imie z obiektu
                System.out.println("My name: " + this.name); // tak wezme imie z metody
            }
        };
    }

    // 1
}

class MyRunnable implements Runnable{
    private String name = "Alfred";

    @Override
    public void run() {
        // this -- wez mi z obiektu tej klasy, na rzecz ktorej wolam Main'a
        System.out.println("My name: " + this.name);
    }
}
