package cz.spsmb.sec.singletonFactory.factory;

public class Bus extends Vehicle implements VehicleInterface {
    @Override
    public void drive() {
        System.out.println("I am driving bus...");
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started.");
    }
}
