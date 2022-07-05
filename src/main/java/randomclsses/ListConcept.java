package randomclsses;

import java.util.*;

public class ListConcept {
    public static void main(String[] args) {
        List<String> list = ListConcept.getList();
        Map<String, List<String>> map = new HashMap<>();
        map.put("ListObject", list);
        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> nextvalue = iterator.next();
            System.out.println(nextvalue.getValue());
        }

    }

    public static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("London");
        list.add("USA");
        return list;

    }
}


