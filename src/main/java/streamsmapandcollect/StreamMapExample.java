package streamsmapandcollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jaswanth
 * this is a traditonal way we can do the below :
 */
public class StreamMapExample {
    static List<String> list1 = Arrays.asList("a", "b", "c", "d", "e");


    public static void main(String[] args) {
        List<String> alphaUpperCase = new ArrayList<>();

        for (String s : list1) {
            System.out.println(alphaUpperCase.add(s.toUpperCase()));
            System.out.println(alphaUpperCase);
            System.out.println(list1);


        }


    }
}
