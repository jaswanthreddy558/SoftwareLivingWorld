package randomclsses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapConcept {
    public static void main(String[] args) {
        Map<String, Integer> mapconcept = new HashMap();
        mapconcept.put("First", new Integer(10));
        mapconcept.put("Second", new Integer(11));
        mapconcept.put("Third", new Integer(12));
        mapconcept.put("Fourth", new Integer(13));

        // First Method
        Iterator<Map.Entry<String, Integer>> am = mapconcept.entrySet().iterator();
        while (am.hasNext()) {
            Map.Entry<String, Integer> stringIntegerEntry = am.next();
            System.out.println(stringIntegerEntry.getKey() + "" + stringIntegerEntry.getValue());
        }

        // Second Method
        for (Map.Entry<String, Integer> me : mapconcept.entrySet()) {
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
        }


        Set<Map.Entry<String, Integer>> concept = mapconcept.entrySet();
        if (concept.contains("First")) {
            System.out.println("Found the key");
        }
        System.out.println(concept.iterator().hasNext());


    }
}
