package functioninterface;

@FunctionalInterface
interface information {
    public String name(String name);

    public default void function() {
        System.out.println("This is an default method");

    }

    public static void staticMethod() {
        System.out.println("This is an static methoda");
    }

}


class Teacher implements information {


    @Override
    public String name(String name) {
        return null;
    }

    @Override
    public void function() {
        information.super.function();
    }
}


public class Student {
    public static void main(String[] args) {
        information information = (name) -> "Hello Student Welcome";
        System.out.println(information.name("Welcome Back Stduent"));
        information.function();


    }
}
