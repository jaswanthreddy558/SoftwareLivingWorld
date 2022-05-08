package functioninterface;


class RunnablewithTradtional implements Runnable {

    @Override
    public void run() {

    }
}


public class LamdaWithRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnablewithTradtional());
        thread.start();
        thread.run();


        // Using Lamda for runnable interface

        Runnable runnable = () -> System.out.println("Using Lamda for runnable interface");
        runnable.run();

    }
}
