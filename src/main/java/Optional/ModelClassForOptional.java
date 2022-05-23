package Optional;

import java.util.List;

public class ModelClassForOptional {
    String name;
    int id;
    List<Integer> phoneNumbers;
    String location;

    public ModelClassForOptional(String name, int id, List<Integer> phoneNumbers, String location) {
        this.name = name;
        this.id = id;
        this.phoneNumbers = phoneNumbers;
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

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "ModelClassForOptional{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNumbers=" + phoneNumbers +
                ", location='" + location + '\'' +
                '}';
    }
}
