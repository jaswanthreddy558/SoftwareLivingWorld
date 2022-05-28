package allPrograms;

import CollectionTopic.EvenNumber;

import java.util.Optional;
import java.util.function.Supplier;

public class MapDemo {
    public static void main(String[] args) {
        Supplier supplier = () -> "Throw Exception";
        EvenNumber evenNumber = null;
        Optional<EvenNumber> evenNumber1 = evenNumber != null ? Optional.of(evenNumber) : Optional.of(new EvenNumber());
        EvenNumber number = evenNumber1.filter(evenNumber2 -> evenNumber2 != null).orElseThrow(supplier);
        number.m1();


    }
}
