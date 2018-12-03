package pl.learn.theory.javaclass1;


public class NameSurname {
    private String name;
    private String surname;
    private int age;

    public NameSurname(String name) {
        this.name = name;
        this.surname = "Anonim";
        setAge(-1);
    }

    public NameSurname(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public static void main(String[] args) {
        NameSurname mechanik = new NameSurname("Tomekaaaaaaaaaaaaaaaaaaaaa", "Mechaniczny", 19);
        NameSurname bibliotekarz = new NameSurname("Arturaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Ksiazek", 333);
        NameSurname malarka = new NameSurname("Agata", "Pedzlinska", 444);

        System.out.println("The mechanic :" + mechanik);
        System.out.println("Neighbour 1 is " + bibliotekarz.getName());
        System.out.println("Agata's age is " + malarka.getAge());
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {

        if (name.length() > 4){
            this.name = name.substring(0,4);}
        else
        {this.name = name;}
        return name;

        }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Age below 0");
            this.age = 0;

            return;

        }
        if (age > 200){
            System.out.println("Age higher than 200");
            this.age = 200;

            return;
        }
        this.age = age;
////        //jak ustawic zeby nie dalo sie wpisac wartosci z pewnego zakresu, bo nie mozna miec -1 lat
////        if (age < 0) {
////            this.age = 0;
////} else if (age > 200)
////        this.age = 200
////        } else {
////        this.age = age;
//        //mozna to tez zrobic ta:
//        if (age < 0) {
//            this.age = 0;
//            return;
//        }
//        if (age > 200) {
//            this.age = 200;
//            return;
//        }
//        }
       }

    @Override
    public String toString() {
        return "NameSurname{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


}
