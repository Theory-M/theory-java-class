package pl.learn.theory.javaclass1.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  { //InterruptedException bo uzywam join()

        System.out.println("Main BEGINING");
        // przedstawienie sie aktualnego Watku THREAD
        System.out.println(Thread.currentThread().getName());

        // lambdą przedstawianie sie watku
        Runnable job = ()-> System.out.println("Worker name: " +
                Thread.currentThread().getName());


        // tak wywolana prace wykona 'main' -- glowny watek
        job.run();

        // mamy klase Thread
        Thread worker = new Thread(job);

        // po zainicjowaniu workera ^
        PwcWorker pwcWorker = new PwcWorker("PwcWorker", job, worker);
        pwcWorker.start();

        worker.setName("worker");

        // cos takiego zrobi 'main', nie 'worker'
        worker.run();
        //zmusic go do pracy:
        worker.start();
        // tego samego workera juz nie moge ponownie zmusic do pracy:
        // worker.start();


        // robie kolejnego pracownika, zeby sprawdzic kto pierwszy wykona prace
        Thread indian = new Thread(job);
        // cos takiego to z InterruptedException
        indian.setName("indian");
        indian.start();

        // jak dodam join() to end of main wykona sie zawsze na koncu -- nie robic THROWS interruptedException, tylko surr try/catch
        try {
            indian.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        // jak tak porobie to dziwne rzeczy zaczna mi wyskakiwac bo watki probuja dodawac do listy kto pierwszy ten lepszy
//        List<String> strings = new ArrayList<>();
//        // jedna praca wykonywana przez 4 Thread'sy
//        Runnable addingStrings = ()-> strings.add(Thread.currentThread().getName());
//        Thread one = new Thread(addingStrings);
//        Thread two = new Thread(addingStrings);
//        Thread three = new Thread(addingStrings);
//        Thread four = new Thread(addingStrings);
//        one.start();
//        two.start();
//        three.start();
//        four.start();

        // wiec powinienem zsynchronizowac
        List<String> strings = new ArrayList<>();
        Runnable addingStrings = ()-> {
            // semaforek -- kto pierwszy wykona robote, ten lepszy, i zwalnia miejsce
            synchronized (strings) {
                strings.add(
                        Thread.currentThread().getName());
            }
        };
        Thread one = new Thread(addingStrings);
        Thread two = new Thread(addingStrings);
        Thread three = new Thread(addingStrings);
        Thread four = new Thread(addingStrings);
        one.start();
        two.start();
        three.start();
        four.start();

        // i jeszcze zeby main sie dostawal do listy
        // niestety tutaj sie wywali -- co gorsze tylko CZASAMI,
        // wiec odtworzenie lub wylapanie bledu moze byc klopotliwe!!!
        System.out.println(strings);

        System.out.println("okazuje sie ze nie wiadomo kto pierwszy wykona prace");
        System.out.println("End of Main");


    }
}
