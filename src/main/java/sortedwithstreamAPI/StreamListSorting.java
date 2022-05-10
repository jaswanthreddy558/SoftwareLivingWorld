package sortedwithstreamAPI;

import randomPackagesForAllUse.StudentInformation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * the below function code for sorted the  different objects using the Java 8 features
 * @author  Jaswanth
 *
 */
public class StreamListSorting {
    public static void main(String[] args) {
        List<StudentInformation> studentInformationList = studentInformationList();
        List<StudentInformation> compared = studentInformationList.stream().sorted(Comparator.comparingInt(StudentInformation::getAge)).collect(Collectors.toList());
        System.out.println(compared);
        List<StudentInformation> minus = studentInformationList.stream().sorted(((o1, o2) -> o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        List<StudentInformation> ascendingOrder = studentInformationList.stream().sorted(Comparator.comparingLong(StudentInformation::getSalary)).collect(Collectors.toList());
        System.out.println(minus);
        System.out.println(ascendingOrder);

    }

    public static List<StudentInformation> studentInformationList() {
        List<StudentInformation> studentInformationList = new ArrayList<>();
        studentInformationList.add(new StudentInformation("Jaswanth", 32, "California", 2000, "Netflix"));
        studentInformationList.add(new StudentInformation("John", 36, "Florida", 2300, "General Motors"));
        studentInformationList.add(new StudentInformation("Peter", 35, "New York", 2600, "Apple"));
        studentInformationList.add(new StudentInformation("Charles", 34, "Texas", 2700, "Dell"));
        studentInformationList.add(new StudentInformation("Prasanth", 30, "Missouri", 2800, "Amazon"));
        return studentInformationList;


    }
}
