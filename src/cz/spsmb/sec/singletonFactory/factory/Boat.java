package cz.spsmb.sec.singletonFactory.factory;

public class Boat extends Vehicle implements VehicleInterface {
    @Override
    public void drive() {
        System.out.println("I am driving boat...");
    }

    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }
}
