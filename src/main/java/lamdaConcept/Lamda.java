package lamdaConcept;

interface Address {

    public String location(String Lastname, String FirstName);

}


public class Lamda {
    public static void main(String[] args) {
        Address address = (A, B) -> (A.toLowerCase() + "" + B.toLowerCase());
        System.out.println(address.location("Sachin", "Tendulkar"));

    }


}
