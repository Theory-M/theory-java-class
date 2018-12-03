package pl.learn.theory.javaclass1.string_tests.computer;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Laptop laptop = new Laptop();

//        changeDrive(PC);

        changeDrive(computer);
        changeDrive(laptop);
    }
    public static void changeDrive(Computer computer){
        System.out.println("change disc");
        computer.changeDrive();
    }
    public static void print(Computer computer){
        System.out.println("print from Computer Class");
    }
}
