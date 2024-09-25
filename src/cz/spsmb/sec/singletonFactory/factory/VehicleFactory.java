package cz.spsmb.sec.singletonFactory.factory;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleTypes vehicleType) throws ClassNotFoundException {
        if (VehicleTypes.CAR.equals(vehicleType)){
            return new Car();
        }
        else if (VehicleTypes.BUS.equals(vehicleType)){
            return new Bus();
        }
        else if (VehicleTypes.BOAT.equals(vehicleType)){
            return new Boat();
        }
        else {
            throw new ClassNotFoundException("Type " + vehicleType + "is not defined.");
        }
    }
}
