package pl.learn.theory.javaclass1.string_tests;

public class StringTest {
    public static void main(String[] args) {
        String name = "Michal";
        // dwie referencje do tego samego obiektu "Michal"
        String anotherMichal = "Michal";
        String theSame = name;
        String secondName = new String("Michal");
        String surname = "Juszczak";

        System.out.println("My name :" + name);
        System.out.println("My surname :" + surname);
        System.out.println("Name, number of letters: " + name.length());
        System.out.println("Surname, number of letters: " + surname.length());
        System.out.println("Name's 3rd letter: " + name.charAt(2));
        System.out.println("Name's 2rd letter: " + name.charAt(1));
//                  poleci wyjatek bo nie ma tylu indeksow w stringu
        //        System.out.println("Name's 13rd letter: " + name.charAt(12));

        // sa dwa rodzaje substringow - Jedno- i Dwuindeksowy, do wyboru
        System.out.println("Shortened to 4 characters, surname: " + surname.substring(0,4));
        System.out.println("Surname from 2nd character: " + surname.substring(1));

        //theSame.replace('u' 'F')
        System.out.println("My surname: " + surname);
        System.out.println("theSame:..." + name);
        System.out.println("change u to F: " + surname.replace('u','F'));

        // string o nazwie 'hello'
        String hello = "hello";
        System.out.println(hello);
        // do tego stringu mozna dodac ' java', jednoczesnie zmieniajac obiekt referencji 'hello'
        hello = hello + " java";
        // concat znaczy +
        System.out.println(hello.concat(" java"));
        System.out.println(hello);

        System.out.println(5 + 6);
        System.out.println(5 + 6 + " - 5 + 6");
        // tabelka kodowa znakow
        System.out.println('J' + 7);
        // bo mozna sprawdzic indeks znaku rzutujac na int(eger)
        System.out.println((int)'J');
        // oszukancza metoda
        System.out.println('J' +0);
        System.out.println("J" + 7);
        System.out.println("5 + 6= " + (5 + 6));
        System.out.println("5 + 6 =/= " + 'f' + 6);


    }
}
