package CollectionTopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(10));
        list.add(new Integer(11));
        list.add(new Integer(12));
        list.add(new Integer(13));
        List<Integer> list1 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

    }
}
