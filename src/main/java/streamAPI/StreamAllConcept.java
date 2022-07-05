package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Jaswanth
 * The Steam Api of consists of two operations
 * 1.Terminal
 * 2.Intermediate Operations
 * 3.Terminal operations are
 * 4.AllMatch
 * 5.NoneMatch
 * 6.NoMatch
 * 7.findany
 * 8.findfirst
 * 9.count
 * 10.min
 * 11.max
 * 12.toarray
 * 13.foreach
 */


public class StreamAllConcept {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Python", ".net", "Salesforce");
        Stream<String> stringStream = stringList.stream();
        System.out.println(stringStream.collect(Collectors.toList()));


        Collection<String> strings = Arrays.asList("Student", "Teacher", "Professor");
        Stream<String> stringStream1 = strings.stream();
        List<String> stringList1=  stringStream1.filter(s -> s.contains("Teacher")).collect(Collectors.toList());
        System.out.println(stringList1);



    }
}
