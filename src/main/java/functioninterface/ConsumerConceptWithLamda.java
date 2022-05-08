package functioninterface;


import java.util.function.Consumer;

public class ConsumerConceptWithLamda {
    public static void main(String[] args) {
        Consumer<String> consumer = (name)-> System.out.println(name);
        consumer.accept("Jaswanth");
    }
}
