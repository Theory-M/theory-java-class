package pl.learn.theory.javaclass1.thread.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Runnable job = ()->{
            for (int i = 0; i < 10; i++){
                // [%d] i [%s] = pierwszy i drugi argument -- i + th.curre().getName()
                System.out.println(String.format("i = [%d], run by: [%s]",i,Thread.currentThread().getName()));
            }
        };

        // robie nowego Executora, po zaimportowaniu klas Executor + Executors
        // to wszystko bedzie sie dzialo w jednym watku ORAZ sie nie zakonczy
        Executor executor1 = Executors.newSingleThreadExecutor();
        for (int i=0; i<100; i++) {
            executor1.execute(job);
        }

        // zrobie 4 nowych Executorow
        // tez sie nie zatrzyma
        Executor terminators = Executors.newFixedThreadPool(4);
        for (int i = 0;i<100;i++){
            terminators.execute(job);
        }
        // jak napisze terminators.shutd+Enter to intelliJ mi przerobi castowanie an EecutorService
        //tak moge wylaczyc
        ((ExecutorService) terminators).shutdown();

        // moge tez zrobic od razu typu ExecutorService
        ExecutorService killers = Executors.newFixedThreadPool(4);
        for (int i = 0;i<100;i++){
            killers.execute(job);
        }
        // i wtedy moge ich wylaczyc -- po skonczonej pracy
        killers.shutdown();
        // po zakonczonej pracy nie moge sie juz podlaczyc do killers i dac im czegos do robienia
//        killers.execute(job);

    }
}
