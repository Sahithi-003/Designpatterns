package com.abstarct.pattern4;

public class MainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new AbstractFactory();
        VehicleType vehicleType=null;
        vehicleType=abstractFactory.getVehicle("Four-Wheeler");
        System.out.println(vehicleType.getVehicleType());
        vehicleType=abstractFactory.getVehicle("Two-Wheeler");
        System.out.println(vehicleType.getVehicleType());
    }
}
