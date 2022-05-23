package Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Jaswanth
 * below method is used for condition check for number
 * as we know that filter will return predicate data type it should be check the condition values
 * as we know that for each method is retrun a consumer. A cosumer retrun a void method ;
 */
public class OptionalClassDemo {
    public static List<ModelClassForOptional> listMethod() {
        List<ModelClassForOptional> list = new ArrayList<>();
        list.add(new ModelClassForOptional("Pranitha", 12, Arrays.asList(12345, 34557), "Florida"));
        list.add(new ModelClassForOptional("JAswanth", 12, Arrays.asList(12345, 34557), "Clafornia"));
        list.add(new ModelClassForOptional("Reddy", 12, Arrays.asList(12345, 34557), "Missouri"));
        list.add(new ModelClassForOptional("PranithaReddy", 12, Arrays.asList(12345, 34557), "Texas"));
        return list;

    }


    public static void main(String[] args) {
        List<ModelClassForOptional> OptionalConcept = OptionalClassDemo.listMethod();
        Optional.of(OptionalConcept.get(0));
        if (!OptionalConcept.contains("Clafornia")) {
            System.out.println("String no needed");
        }
        // below method is used for condition check for number
        // as we know that filter will return predicate data type it should be check the condition values
        List<ModelClassForOptional> florida = OptionalConcept.stream().filter(number -> number.getLocation().contains("Florida")).collect(Collectors.toList());
        System.out.println(florida);
        // as we know that for each method is retrun a consumer. A cosumer retrun a void method ;
        OptionalConcept.stream().forEach(forEachConcept -> System.out.println(forEachConcept));
        List<ModelClassForOptional> aab = OptionalConcept.stream().filter(va -> va.getLocation().contains("Texas")).collect(Collectors.toList());
        System.out.println(aab);
        boolean match = OptionalConcept.stream().anyMatch(ba -> ba.getLocation().isEmpty());
        System.out.println(match);
        List<ModelClassForOptional> optionalList = OptionalConcept.stream().filter(va -> va.getLocation().contains("California")).collect(Collectors.toList());

    }
}