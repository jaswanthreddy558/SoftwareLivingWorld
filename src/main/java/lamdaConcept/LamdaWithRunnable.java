package lamdaConcept;

class ThreadDemo {

}

public class LamdaWithRunnable{
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Runnable runnable = () -> System.out.println("Runnable inteface");
        runnable.run();
        Thread thread = new Thread(new Thread());
        thread.run();
        thread.start();

    }
}
