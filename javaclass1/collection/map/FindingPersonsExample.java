package pl.learn.theory.javaclass1.collection.map;

import pl.learn.theory.javaclass1.equals_and_hashcode.Person;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindingPersonsExample {

    public static void main(String[] args) {
        // 1). map ids over Person
        // 2). add 10 persons to map
        // 3). find only persons younger than 25
        // 4). add result to list

        //1)
        Map<String, Person> peopleMap = new HashMap<>();
        peopleMap.put("11", new Person("michal", "j", 11));
        peopleMap.put("21", new Person("maria", "j", 14));
        peopleMap.put("31", new Person("ina", "j", 3));
        peopleMap.put("41", new Person("wiera", "j", 34));
        peopleMap.put("51", new Person("maria", "j", 25));
        peopleMap.put("61", new Person("heniek", "j", 56));
        peopleMap.put("71", new Person("maciek", "j", 34));
        peopleMap.put("81", new Person("karol", "j", 4));
        peopleMap.put("91", new Person("adolf", "j", 33));
        peopleMap.put("01", new Person("malkrer", "j", 29));
        peopleMap.put("101", new Person("kolrak", "j", 47));

        List<Person> youngPersons = new LinkedList<>();

        Person currentPerson;
        for (String  id : peopleMap.keySet()){
            currentPerson = peopleMap.get(id);

            if (currentPerson.getAge() < 25){
                youngPersons.add((currentPerson));
            }
        }
        for (Person p : youngPersons){
            System.out.println("young person:" + p);
        }



    }



}
