package pl.learn.theory.javaclass1.lambda.method_reference;

public class ModelSorter {
    static int modelOrder (String model1, String model2){
        //jesli chce w kolejnosci OD KONCA to robie tak:
        return model2.compareTo(model1);
    }
}
