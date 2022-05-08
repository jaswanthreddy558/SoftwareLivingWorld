package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeInformation {

    String name;
    int salary;
    String location;
    boolean sex;

    public EmployeeInformation(String name, int salary, String location, boolean sex) {
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAge() {
        return sex;
    }

    public void setAge(boolean age) {
        this.sex = age;
    }

    @Override
    public String toString() {
        return "EmployeeInformation{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", age=" + sex +
                '}';
    }
}


public class StreamAPISecondExample {

    public static List<EmployeeInformation> function() {
        List<EmployeeInformation> employeeInformations = new ArrayList<>();
        employeeInformations.add(new EmployeeInformation("peter", 12234, "Florida", true));
        employeeInformations.add(new EmployeeInformation("John", 12234, "Atlanta", true));
        employeeInformations.add(new EmployeeInformation("rich", 12234, "California", false));
        employeeInformations.add(new EmployeeInformation("paul", 12234, "Texas", false));
        return employeeInformations;
    }


    public static void main(String[] args) {
        List<EmployeeInformation> list = StreamAPISecondExample.function();
        for (EmployeeInformation jk : list) {
            if (jk.getSalary() > 123456) {
                list.add(jk);
            }
        }

        List<EmployeeInformation> employeeInformations = list.stream().
                filter(value -> value.getSalary() > 123456).
                collect(Collectors.toList());
        System.out.println(employeeInformations);
    }


}