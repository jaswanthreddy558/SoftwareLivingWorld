package functioninterface;

import java.util.function.Function;

class Boss implements Function<String, Integer>,Runnable{


    @Override
    public Integer apply(String s) {
        return s.length();
    }

    @Override
    public void run() {

    }
}


public class Employee {
    public static void main(String[] args) {

        Function<String, Integer> bossObject = new Boss();
        Runnable runnable = new Boss();
        runnable.run();
        Boss boss = new Boss();



        bossObject.apply("Employee Age of year");

        Function<String, Integer> usingLamdaObject = (String name) -> name.length();
        Function<String, String> usingLamdaObject2 = (String name) -> name.toLowerCase();


        System.out.println(usingLamdaObject2.apply("Hello Employee"));
        System.out.println(usingLamdaObject.apply("Hello Employee"));
        System.out.println("Add New Print Ln");


    }


}
