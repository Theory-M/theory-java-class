package pl.learn.theory.javaclass1.homework.rusz_glowa;

public class Tablice {

    public static void main(String[] args) {


        Pies[] mojePsy = new Pies[3];

//        Object[] szereg = new Object[3];
//        szereg[0] = new Kot[3];

        // tablica dwuwymiarowwa (moze miec wiecej wymiarow) jest to tablica skladajaca sie z tablic
        Pies[][] dogTable = new Pies[3][3];

        dogTable[1][1] = new Pies("leszek",2);

        System.out.println(dogTable[1][1]);


        mojePsy[1] = new Pies(null, 0);
        mojePsy[1].waga = 3;
        mojePsy[1].name = "azor";

        mojePsy[0] = null;

        System.out.println(mojePsy[0]);
        System.out.println(mojePsy[2]);

        System.out.println(mojePsy[1]);

        System.out.println(" testing: ");
        for(int i = 0; i<3; i++) {
            System.out.println(mojePsy[i]);
        }
//        String[] columnNames = {"First Name",
//                "Last Name",
//                "Sport",
//                "# of Years",
//                "Vegetarian"};
//
//        Object[][] data = {
//                {"Kathy", "Smith",
//                        "Snowboarding", new Integer(5), new Boolean(false)},
//                {"John", "Doe",
//                        "Rowing", new Integer(3), new Boolean(true)},
//                {"Sue", "Black",
//                        "Knitting", new Integer(2), new Boolean(false)},
//                {"Jane", "White",
//                        "Speed reading", new Integer(20), new Boolean(true)},
//                {"Joe", "Brown",
//                        "Pool", new Integer(10), new Boolean(false)}
//        };

//        JTable table = new JTable(data, columnNames);







    }
}