package pl.learn.theory.javaclass1.string_tests;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Michal");

        String ala = "ala" + " ma" + " kota";

        StringBuilder ala2 = new StringBuilder();
//        ala2.append("ala");
//        ala2.append(" ma");
//        ala2.append(" kota");
        //
        ala2.append("ala")
                .append(" ma")
                .append(" kota");

        //daj mi to co jest w srodku:
        String ala2String = ala2.toString();
        ala2.replace(4, 6, "miala");
        System.out.println(ala2);




    }
}
