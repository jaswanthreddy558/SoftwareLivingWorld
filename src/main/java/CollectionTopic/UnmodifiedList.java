package CollectionTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiedList {
    public static void main(String[] args) {
        List<String> findDuplicate = Arrays.asList("Jas", "Jaswanth", "Duplicate", "Duplicate");
        int size = 0;
        for (int i = 0; i < findDuplicate.size(); i++) {
            size += i;
            System.out.println("finding all the values" + size);

        }

    }
}

class Duplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jaswanth", "Reddy", "Chinna", "Reddy", null);
        List<String> ing = list.stream().distinct().collect(Collectors.toList());
        System.out.println(ing);
        System.out.println(list());

    }

    public static List<String> list() {
        List<String> stringList = Arrays.asList("Student", "Teacher", "Lecture", "Student");


        //After
        List<String> list = new ArrayList<>();
        for (String a : stringList) {
            if (!list.contains(a)) {
                list.add(a);
                System.out.println(list);

            }

        }

        return stringList;
    }
}

