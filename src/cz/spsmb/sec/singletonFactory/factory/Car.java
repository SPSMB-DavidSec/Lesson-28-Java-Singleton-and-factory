package cz.spsmb.sec.singletonFactory.factory;

public class Car extends Vehicle implements VehicleInterface {
    @Override
    public void drive() {
        System.out.println("I am driving car...");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}
