package streamAPI;


import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jaswanth");
        list.add("JaswanthKesar");
        list.add("JaswanthReddy");
        list.add("Jas");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        Map<String, String> map = new HashMap<>();
        map.put("abc", "abcd");
        map.put("abcd", "abcde");
        map.put("a", "abcd");
        map.put("ac", "abcd");
        map.put("ace", "acd");
        Set<Map.Entry<String, String>> s = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = s.iterator();
        while (iterator1.hasNext()) {
            Map.Entry next = iterator1.next();
            System.out.println(next.getKey() + " , " + next.getValue());
        }


    }


}
