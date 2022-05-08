package methodReferences;

import java.util.function.Function;


class Example {

    public static String name(String Location) {
        String inputName = Location.toLowerCase();
        return inputName;

    }

    public static void main(String[] args) {
        String methodName = name("JaswanthReddy");
        System.out.println(methodName.toLowerCase());


    }
}

public class MethodReferenceConcept {
    public static void main(String[] args) {
        Function<String, String> stringStringFunction = String::toUpperCase;
        System.out.println(stringStringFunction.apply("HelloWorld"));


        //
    }
}
