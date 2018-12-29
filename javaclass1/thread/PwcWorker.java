package pl.learn.theory.javaclass1.thread;

// jezeli chce sie bawic kolejnosciami wykonywania pracy przez Watki
public class PwcWorker extends Thread{

    private Runnable jobToDo;
    private Thread afterThis;

    // robie konstruktor:
    public PwcWorker(String name, Runnable jobToDo, Thread afterThis){
        // wskazujemy mu ktora prace ma zrobic
        super(jobToDo);
        setName(name);
        // jedyune co robie to zachowuje prace do wynonania
        this.jobToDo = jobToDo;
        //i jak skonczy to po tym ma zrobic
        this.afterThis = afterThis;
    }

    // nadpisuje metode start()
    @Override
    public synchronized void start() {
        // i dodaje jej opcje do
        try{
            afterThis.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        super.start();
    }
}
