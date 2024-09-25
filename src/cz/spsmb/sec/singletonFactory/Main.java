package cz.spsmb.sec.singletonFactory;

import cz.spsmb.sec.singletonFactory.factory.Vehicle;
import cz.spsmb.sec.singletonFactory.factory.VehicleFactory;
import cz.spsmb.sec.singletonFactory.factory.VehicleTypes;

public class Main {

    public static void main(String[] args) {

	Singleton singleton = Singleton.getInstance();
    singleton.getSomeList().add("Ahoj");
    singleton.getSomeList().add("jak");
    singleton.getSomeList().add("se");
    singleton.getSomeList().add("mas");

    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton.equals(singleton2));
    System.out.println(singleton2.getSomeList());

    TestThread testThread = new TestThread();
    TestThread testThread2 = new TestThread();
    testThread.run();
    testThread2.run();


        /**
         *  Factory example
         */
        try {
            Vehicle carVehicle = VehicleFactory.createVehicle(VehicleTypes.CAR);
            carVehicle.startEngine();
            carVehicle.drive();

            Vehicle busVehicle = VehicleFactory.createVehicle(VehicleTypes.BUS);
            busVehicle.startEngine();
            busVehicle.drive();

        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
