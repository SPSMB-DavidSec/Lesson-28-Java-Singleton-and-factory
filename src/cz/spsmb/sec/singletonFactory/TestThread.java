package cz.spsmb.sec.singletonFactory;

public class TestThread implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        singleton.getSomeList().add("Hello from thread;");
    }
}
