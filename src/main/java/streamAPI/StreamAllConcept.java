package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
