package pl.learn.theory.javaclass1.garbage_collector;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FeaturePhoneExample {

    public static void main(String[] args) {
        Set<FeaturePhone> featurePhones = new HashSet<>();

        FeaturePhone nokia1 = new FeaturePhone("6210");
        FeaturePhone nokia2 = new FeaturePhone("6210");

        System.out.println("nokia1 = ? nokia2: " + (nokia1.equals(nokia2)));

        featurePhones.add(nokia1);
        featurePhones.add(nokia2);



//        featurePhones.add(new FeaturePhone("6210"));
//        featurePhones.add(new FeaturePhone("6210"));

        System.out.println(featurePhones.size());

        // tak moge zrobic out of memory exception
        while (true){
            featurePhones.add(new FeaturePhone("alcatel"));
//            FeaturePhone nokia3 = new FeaturePhone("f");
//            featurePhones.add(nokia3);
        }
    }
}
