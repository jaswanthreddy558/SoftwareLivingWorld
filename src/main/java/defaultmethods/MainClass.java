package defaultmethods;

interface forallmethods {
    int level();

    default String bikeName() {
        return "Jaswanth";
    }

    static String nameofBiker() {
        return "hello String";
    }


}


/**
 * @author Jaswanth
 * the below function is written for holding for abstract methods
 *
 */
public class MainClass implements forallmethods {


    @Override
    public int level() {
        return 0;
    }

    @Override
    public String bikeName() {
        return null;
    }


    public static void main(String[] args) {
        forallmethods forallmethods = new MainClass();
        System.out.println(forallmethods.bikeName());
        System.out.println(forallmethods.level());

    }
}
