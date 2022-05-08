package functioninterface;


import java.util.function.Consumer;

class ConsumerInterfaceWithTrdationalMethod implements Consumer<String> {


    @Override
    public void accept(String name) {
        System.out.println("Hello What is u r name");

    }
}

public class ConsumerConcept {
    public static void main(String[] args) {
        Consumer<String> consumer = new ConsumerInterfaceWithTrdationalMethod();
        System.out.println(consumer);
        System.out.println("New Print");

    }
}
