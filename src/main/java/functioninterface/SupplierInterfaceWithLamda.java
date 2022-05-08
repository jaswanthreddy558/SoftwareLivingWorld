package functioninterface;

import java.time.LocalTime;
import java.util.function.Supplier;

class SupplierTradtional implements Supplier<LocalTime> {

    @Override
    public LocalTime get() {
        return LocalTime.now();
    }
}


public class SupplierInterfaceWithLamda {
    public static void main(String[] args) {
        Supplier<LocalTime> localTimeSupplier = new SupplierTradtional();
        System.out.println(localTimeSupplier.get());


        // Using Same Logic with Lamda

        Supplier<LocalTime> localTimeSupplier1 = ()-> LocalTime.now();
        System.out.println(localTimeSupplier1.get());






    }
}
