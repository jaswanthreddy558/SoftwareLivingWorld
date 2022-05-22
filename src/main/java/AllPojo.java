import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllPojo {
    String name;
    int id;
    String location;

    public AllPojo(String name, int id, String location) {
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

    public static void main(String[] args) {
        List<AllPojo> listConcept = Po.list();
        List<Integer> list = listConcept.stream().map(val -> val.getId()).collect(Collectors.toList());
        System.out.println(list);


    }


}


class Po {
    public static List<AllPojo> list() {
        List<AllPojo> list = new ArrayList<>();
        list.add(new AllPojo("Jaswanth", 123, "Florida"));
        list.add(new AllPojo("Chinna", 123, "Missouri"));
        list.add(new AllPojo("Jashu", 124, "Texas"));
        list.add(new AllPojo("Reddy", 125, "California"));
        return list;
    }
}
