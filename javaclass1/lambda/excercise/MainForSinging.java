package pl.learn.theory.javaclass1.lambda.excercise;

public class MainForSinging {
    public static void main(String[] args) {
        // tego nie potrzebuje w tym przypadku
//        Singer singer = new Singer();

        Singing singer1 = ()-> System.out.println("I am singing");
        singer1.soprano();

        Singing concerto = new Singing() {
            @Override
            public void soprano() {

            }
            //domyslnie wykona 'bass' i 'alto'
        };
//        singer.sing(concerto);

    }
}

