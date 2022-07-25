package com.abstarct.pattern4;

public class AbstractFactory {
    public VehicleType getVehicle(String vehicle){
        VehicleType vehicleType=null;
        if(vehicle.equals("Four-Wheeler")){
            vehicleType=new CarFactoryImpl();
        }
        else if(vehicle.equals("Two-Wheeler")){
            vehicleType=new BikeFactoryImpl();
        }
        return vehicleType;
    }
}
