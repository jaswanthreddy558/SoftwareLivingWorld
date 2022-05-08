package lamdaConcept;


interface colour {
    public void draw();
}


public class LamdaExample {
    public static void main(String[] args) {
        colour colour = () -> System.out.println("Drawing a Orange");
        colour colour1 = () -> System.out.println("Drawing a Grapes");
        colour colour3 = () -> System.out.println("Drawing a Banana");
        print(colour);
        print(colour1);
        print(colour3);
    }


    public static void print(colour colour) {
        colour.draw();
    }

}
