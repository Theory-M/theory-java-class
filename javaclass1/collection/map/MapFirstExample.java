package pl.learn.theory.javaclass1.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {

    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap<>();
//        idsOverNames.put("867744993556", "michal");
//        idsOverNames.put("82", "jacek");
//        idsOverNames.put("82", "marcin");

        System.out.println(idsOverNames.put("82","marcin"));
        System.out.println(idsOverNames.put("82","jacek"));
        System.out.println(idsOverNames.put("82","ewa"));

        // moge szukac po numerze, ale skoro dodalem wiecej o takim samym to wyda mi null
        idsOverNames.get("82");

        System.out.println(idsOverNames.put("12","tomek"));
        System.out.println(idsOverNames.put("23","jacek"));
        System.out.println(idsOverNames.put("34","zenek"));
        System.out.println(idsOverNames.put("45","alfred"));
        System.out.println(idsOverNames.put("56","heniek"));

        //for (idsOverNames)
//        String key;
//        String value;

        // daj mi zbior wszystkich kluczy: i dla nich daj mi wartosc kazdego GET, czyli przejscie po wszystkich kluczach
        for (String key : idsOverNames.keySet()) {
            System.out.println("Key: " + key + ", value: " + idsOverNames.get(key));
        }

        Map<String, String> secondMap = new LinkedHashMap<>();



    }
}
