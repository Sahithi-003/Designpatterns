package com.abstarct.pattern4;

public class CarFactoryImpl implements VehicleType{
    public Car getCar(String brandName){
        Car car=null;
        if(brandName.equals("Maruti")){
            car=new Maruti();

        }
        else if(brandName.equals("Swift")){
            car=new Swift();

        }
        return car;
    }
    @Override
    public String getVehicleType() {
        return "Four-Wheeler";
    }

}
