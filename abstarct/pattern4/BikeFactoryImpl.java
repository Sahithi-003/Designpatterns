package com.abstarct.pattern4;

public class BikeFactoryImpl implements VehicleType{
    public Bike getBike(String brandName){
       Bike bike=null;
        if(brandName.equals("Bajaj")){
           bike=new Bajaj();

        }
        else if(brandName.equals("TVS")){
            bike=new TVS();

        }
        return bike;
    }
    @Override
    public String getVehicleType() {
        return "Two-Wheeler";
    }
}
