package streamsmapandcollect;

import java.util.ArrayList;
import java.util.List;

public class UsingFeatureWithStreamMap {
    public static void main(String[] args) {
        List<Address> profilList = new ArrayList<>();
        for (Address profile : profilList) {
            profilList.add(new Address(profile.getName(), profile.getLocation(), profile.getPassword()));
            profilList.add(new Address(profile.getName(), profile.getLocation(), profile.getPassword()));
        }

        for (Address profile : profilList) {
            System.out.println(profile);
        }
    }


}

class profile {
    String name;
    String location;
    int age;
    String email;

    public profile(String name, String location, int age, String email) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "profile{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}


class Address {
    String name;
    String location;
    int age;
    String password;

    public Address(String name, String location, String password) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}