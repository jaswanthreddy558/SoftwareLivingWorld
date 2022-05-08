package OptionalConcept;


import java.util.Optional;

/**
 * @author Jaswanth
 * this class is about Optional inteface
 */
public class OptionalDemo {


    public static void main(String[] args) {
        String email = "Software Living World";
        // below are the three static methods
        // of , empty, ofNullable method's are static methods


        Optional<Object> emptyConcept = Optional.empty();
        System.out.println(emptyConcept);


        // Throws:NullPointerException – if value is null
        Optional<Object> ofConcept = Optional.of(email);
        System.out.println(ofConcept);


        //The Nullable method is used when the value is null it will return the is empty.
        // if the value is there it will return the value.


        Optional<Object> nullableConcept = Optional.ofNullable(email);

        Optional<String> getMethodConcept = Optional.ofNullable(email);
        System.out.println(getMethodConcept);
        // System.out.println(getMethodConcept2);

        Optional<String> getMethodConcept2 = Optional.of(email);
        getMethodConcept2.orElseThrow(() -> new RuntimeException("Email is not Exist"));


        if (getMethodConcept.isPresent()) {
            getMethodConcept.get();
            System.out.println("The value is not Getting");

        } else {
            getMethodConcept.orElse("Changing the World");
        }

        /*
The isPresent() method of java.util.Optional class in Java is used to find out if there is a value present in this Optional
instance. If there is no value present in this Optional instance, then this method returns false, else true.
 */
        if (nullableConcept.isPresent()) {

            nullableConcept.orElse("Jaswanth@gmail.com");

//
//               The get() method of java.util.Optional class in Java is used to get the value of this Optional instance.
//               If there is no value present in this Optional instance, then this method throws NullPointerException.

            System.out.println(nullableConcept.get() + "" + "Value is Present");
            // orElseGet Method is used for throw the expection when the value is not present.
            Object hello = nullableConcept.orElseGet(() -> "Hello World");
            System.out.println(hello);


        } else {
            System.out.println("Value is Not Present");
        }

        String Gender = "Male";


        Optional<String> gender = Optional.of(Gender);
        Optional<String> femail = Optional.of("FeMale");
        gender.ifPresent((s) -> System.out.println("THere is no values"));
        femail.ifPresent((t) -> System.out.println("THere is no values"));

        // Filter Method Where we can check the boolean conditions
        getMethodConcept2.filter(val -> val.contains("Software")).orElseThrow(() -> new RuntimeException("New Excpetion"));
        gender.filter(version -> version.contains("Male")).ifPresent((res)-> System.out.println(res));


        // Map Method used from the Function Interface.

        getMethodConcept2.filter(value ->value.isEmpty()).map(String ::trim);
        System.out.println(getMethodConcept2 + "" + "Usingf Map Here after trim the text") ;




    }


}
