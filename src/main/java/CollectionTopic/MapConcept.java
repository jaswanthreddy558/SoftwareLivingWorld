package CollectionTopic;

import java.util.HashMap;
import java.util.Map;

class Employee {
    String name;
    int id;
    String location;

    public Employee(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}


public class MapConcept {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();
        map.put(123, new Employee("Jaswanth", 123, "Florida"));
        map.put(124, new Employee("JaswanthReddy", 124, "California"));
        map.put(125, new Employee("Jasshu", 125, "Texas"));
        map.put(126, new Employee("Jasprani", 126, "Missouri"));
        map.put(127, new Employee("Chinna", 127, "Seattle"));
        for (Integer key : map.keySet()) {
            if (key % 2 == 0) {
                System.out.println(map.get(key).getName());
            }
        }
    }
}
