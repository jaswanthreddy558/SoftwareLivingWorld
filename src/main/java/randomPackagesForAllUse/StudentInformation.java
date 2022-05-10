package randomPackagesForAllUse;

public class StudentInformation {
    private String name;
    private int age;
    private String location;
    private int salary;
    private String companyName;

    public StudentInformation(String name, int age, String location, int salary, String companyName) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public String toString() {
        return "StudentInformation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
