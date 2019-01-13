package pl.learn.theory.javaclass1.solid.single_object_responsibility;

public class DogTrainer {

    private String name;

    public DogTrainer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DogTrainer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void teachTrick (Dog dog){
        System.out.println(String.format("Dog [%s] is trained by: [%s]", dog.getName(), name)); // [%s] String zostanie zaciagniety z podanych parametrow
    }
    public void walkDog (Dog dog){
        System.out.println(String.format("[%s] is taking [%s] for a walk", name, dog.getName()));
    }
    public void cureDog(Dog dog){
        System.out.println(String.format("[%s] is treating [%s]", name, dog.getName()));
    }

    public void feedDog (Dog dog) {
        System.out.println("Feeding dog: " + dog.getName() + " by " + name);
    }

}
