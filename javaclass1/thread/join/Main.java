package pl.learn.theory.javaclass1.thread.join;

public class Main {

    public static void main(String[] args) {
        System.out.println("start of main");

        // zaczynam od zrobienia job'a
        Runnable job = ()->{
            for (int i = 0; i < 200; i++){
                // [%d] i [%s] = pierwszy i drugi argument -- i + th.curre().getName()
                System.out.println(String.format("i = [%d], run by: [%s]",i,Thread.currentThread().getName()));
            }
        };

        Thread worker = new Thread(job);

        // jak workera zrobie w Daemon, jesli nie chce zeby po skonczeniu watku Main ten watek dalej chodzil
        // musi byc w tej kolejnosci napisane
        worker.setDaemon(true);
        worker.start();

        Thread lifter = new Thread(job);
        Thread heavyLifter = new Thread(job);

        try {
            lifter.join();
            heavyLifter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lifter.start();
        heavyLifter.start();



        // mamy tez mozliwosc zatrzymania biezacego watku Main, wiec czesc workera ktory jest Daemon'em zdazy sie wykonac
        // tak jednak nie warto robic, bo na przyklad nie wiadomo na jaka maszyne trafi program
        try {
//            worker.sleep(1000); -- cos takiego nie robi nic z workerem, tylko oszukuje i robi w main'ie, bo workerowi mozna dac tylko start()
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("end of main");
    }
}
