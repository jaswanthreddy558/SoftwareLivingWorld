package functioninterface;


import java.util.function.Consumer;

class ConsumerInterfaceWithTrdationalMethod implements Consumer<String> {


    @Override
    public void accept(String name) {

    }
}

public class ConsumerConcept {
    public static void main(String[] args) {
        Consumer<String> consumer = new ConsumerInterfaceWithTrdationalMethod();
        System.out.println(consumer);
        System.out.println("New Print");

    }
}
